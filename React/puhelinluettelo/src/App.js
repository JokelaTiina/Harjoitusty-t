import React, { useState, useEffect } from 'react';
import personService from './services/persons'
import Filter from './components/Filter.js'

  // testattu komponentin toiminta samassa tiedostossa
  const PersonForm = ( {addName, newName, handleNameChange, newNumber, handleNumberChange} ) => {
    return (
      <div>
          <form onSubmit={addName}>
          <div>name: <input value={newName} onChange={handleNameChange} /></div>
          <div>number: <input value={newNumber} onChange={handleNumberChange} /></div>
          <div><button type="submit">add</button></div>
        </form>
      </div>
    )
  }

const App = () => {
  const [persons, setPersons] = useState([])
  const [newName, setNewName] = useState('')
  const [newNumber, setNewNumber] = useState('')
  const [showAll, setShowAll] = useState(true)
  const [toFind, setToFind] = useState('')
  const [infoMessage, setInfoMessage] = useState(null)
  //const [errorMessage, setErrorMessage] = useState(null)

  // haetaan palvelimelta json-muotoinen puhelinluettelo
  useEffect(() => {
    personService
      .getAll()
      .then(initialPersons => {
        setPersons(initialPersons)
        // kytketään viestit pois päältä
/*         setInfoMessage(null)
        setErrorMessage(null) */
      })
  }, [])

  const Notification = ({ message }) => {

    if (message === "Person has already removed from server") {
      return (
        <div className="error">
        </div>
      )
    }

    if (message === null) {
      return null
    }


    return (
      <div className="info">
        {message}
      </div>
    )
  }
  
  const addName = (event) => { 
    // estetään lomakkeen oletusarvoinen toiminto   
    event.preventDefault()
    
    // tarkistetaan että onko syötetty nimi jo puhelinluettelossa, ja  
    // talletetaan viite löydetystä henkilöstä
    /* let feed = persons.find( function ( ele ) {
       return ele.name === newName
    })  alla oleva sama kuin yllä */
    let feed = persons.find(person => person.name === newName)
    
    if (feed) {
      if (window.confirm(`${newName} is already added to phonebook, replace the old number?`)) {
        // Luodaan uusi olio, jonka sisältö on sama kuin vanhan olion, paitsi uusi numero
        const changedPerson = { ...feed, number: newNumber}

        personService
          .update(feed.id, changedPerson)  
          .then(returnedPerson => {
            // jos id ei ole haettu id, otetaan uuteen puhelinluettoloon vanha yhteystieto,
            // jos kyseessä on haettu id, lisätään palvelimen palauttama yhteystieto 
            setPersons(persons.map(person => person.id !== feed.id ? person : returnedPerson))
            // tyhjennetään tekstikentät
            setNewName('') 
            setNewNumber('')
            setInfoMessage(`Updated ${returnedPerson.name}`)
            setTimeout(() => {
              setInfoMessage(null)
            }, 5000)
          })
          .catch(error => {   
            console.log('fail')     
            setInfoMessage(error,`Updating not succeeded!`)
            setTimeout(() => {
              setInfoMessage(null)
            }, 5000)
          })       
      }
    } else { // yhteystietoa ei ole ennestään, joten se täytyy luoda palvelimella
      const nameObject = {
        name: newName,
        number: newNumber
      } 

      personService
        .create(nameObject)
        .then(returnedPerson => {
          setPersons(persons.concat(returnedPerson))
          // tyhjennetään tekstikentät
          setNewName('') 
          setNewNumber('')
          setInfoMessage(`Added ${returnedPerson.name}`)
          setTimeout(() => {
            setInfoMessage(null)
          }, 5000)
        }) 
/*         .catch(error => {
          console.log(error.response.data)
          setInfoMessage(error,`Name or number is too short!`)
          setTimeout(() => {
            setInfoMessage(null)
          }, 5000)
        })  */          
    }  
  }

  const handleNameChange = (event) => {
    //console.log(event.target.value)
    setNewName(event.target.value)
  }

  const handleNumberChange = (event) => {
    setNewNumber(event.target.value)
  }

  const handleToFindChange = (event) => {
    setToFind(event.target.value)
  }

  const search = (event) => {
    event.preventDefault() 
    // input-kentässä oleva nimi näytetään listassa kaikkien nimien sijaan   
    setShowAll(!showAll)    
  }

  const Persons = () => {
    return (
      <div>
        {listOfNames()}
      </div>
    )
  }

  const deletePerson = (id) => {
    // etsitään poistettava henkilö
    const person = persons.find(p => p.id === id)

    if (window.confirm('Haluatko todella poistaa henkilön ' + person.name  +'?')) {
      personService
      .deleteId(person.id)
      .then(response => {
        //olemattoman henkilön poistaminen, eli suodatetaan 
        //uuteen taulukkoon henkilöt,joilla on eri id
        setPersons(persons.filter(p => p.id !== id))
        setInfoMessage(`Deleted ${person.name}`)
          setTimeout(() => {
            setInfoMessage(null)
          }, 5000)
      })
      .catch(error => {   
        console.log('fail')     
        setInfoMessage(error + `Person ${person.name} has already removed!`)
        setTimeout(() => {
          setInfoMessage(null)
        }, 5000)
      }) 
    }    
  }

  // funktio valintaa varten että näytetäänkö kaikki vai pelkkä etsittävän henkilön nimi
  const namesToShow  = showAll 
  ? persons
  : persons.filter(person => person.name.toLowerCase() === toFind.toLowerCase())
      
  // listataan web-sivulla näytettävät henkilöt
  const listOfNames = () => namesToShow.map(person => 
  <p key={person.id}>{person.name} {person.number} <button onClick={() => deletePerson(person.id)}>delete</button></p>)  
    
  return (
    <div>
      <h2>Phonebook</h2>
      <Notification message={infoMessage} />
      {/* {errorMessage} */}
      <h3>filter shown with </h3>
      <Filter toFind={toFind} search={search} handleToFindChange={handleToFindChange}/>
     
      <h3>add a new:</h3>
      <PersonForm addName={addName} handleNameChange={handleNameChange} handleNumberChange={handleNumberChange}/>

      <h2>Numbers</h2>
      <Persons />
      
    </div>
  )
}
export default App


