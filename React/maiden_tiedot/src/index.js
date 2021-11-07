import React, { useState, useEffect } from 'react';
import axios from 'axios'
import ReactDOM from 'react-dom';

const App = () => {
  const [countries, setCountries] = useState([])
  const [countryName, setCountryName] = useState('')
  const [showAll, setShowAll] = useState(true)  
     
  useEffect(() => {
    axios
      .get('https://restcountries.eu/rest/v2/all')
      .then(response => {
        console.log(response.data)
        setCountries(response.data)
      })
    }, [])  

  const findCountry = (event) => {
    event.preventDefault()    
  //   console.log('muutos tapahtui?', event.target)
    // input-kentässä oleva nimi näytetään listassa kaikkien nimien sijaan   
    setShowAll(!showAll)
  }
 
  const handleNameChange = (event) => {
  //   console.log(event.target.value)    
    setCountryName(event.target.value)
  }  

  const countriesToShow = showAll
  ? countries
  : countries.filter(country => country.name.includes(countryName))

  const fewCountry = 
    countriesToShow.map(country => <div key={country.name}>{country.name}</div>)
  
  
  const ResultOfCountries = ({ list }) => {
    console.log(list.length)
    if (list.length > 10) {
      return (
        <div> Too many matches, specify another filter! </div>
      )
     }
    else if (list.length > 1 && list.length <= 10) {
      return (        
      <div><br/>{fewCountry}<br/></div> 
      )
    } else if (list.length === 1) {
      return (
        <div>{list}</div>
      )
    } 

    return (
      <div>{list}</div>
    )
  }
  
  const listOfCountries =  
    countriesToShow.map(country => <div key={country.name}><h2>{country.name}
    </h2>capital: {country.capital}<br/>population: {country.population}<br/>
    languages:<ul>{country.languages.map(language =><li key={language.name}>{language.name}</li>)}</ul>
    <img src={country.flag} alt="flag" height="82" width="102"/><br/><br/></div>)
  
  return (
    <div>
      find country
      <form onChange={findCountry}>
        <input value={countryName} onChange={handleNameChange}/>        
      </form>
      <ResultOfCountries list={listOfCountries} />       
    </div>
  )
}

ReactDOM.render(<App />, document.getElementById('root'));


