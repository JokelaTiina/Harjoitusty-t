import React, { useState } from 'react'
import ReactDOM from 'react-dom';

// tämä on oikea paikka määritellä komponentti!
const Button = (props) => (
    <button onClick={props.handleClick}>
        {props.text}
    </button>
)

const Display = props => <div>{props.value}</div>

const App = (props) => {
    const [value, setValue] = useState(10)

   /*  const hello = (who) => () => {
        console.log('hello', who)
        
    }   */
    
    const setToValue = (newValue) => {
        setValue(newValue)
    }

    
       
    return (
        <div>
            <Display value={value} />
            <Button handleClick={() => setToValue(value + 1000)} text='thousand'/>
            <Button handleClick={() => setToValue(0)} text='reset'/>
            <Button handleClick={() => setToValue(value + 1)} text='increment'/>   
            {/* <button onClick={() => setToValue(0)}>reset</button>
            <button onClick={() => setToValue(value + 1)}>increment</button> */}
            {/* <button onClick={hello('world')}>button</button>   
             <button onClick={hello('react')}>button</button>
             <button onClick={hello('function')}>button</button>  */}       
        </div>
        )
    
    }
   
                

    




ReactDOM.render(<App />, document.getElementById('root'));

