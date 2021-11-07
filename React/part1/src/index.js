import React from 'react';
import ReactDOM from 'react-dom';

const Hello = ({name, age}) => {
    const bornYear = () => new Date().getFullYear() -age
        
    return (
        <div>
            <p>Hello {name}, you are {age} years old</p>
            <p>So you were probably born {bornYear()}</p>
        </div>
    )
}
     

const App = () => {
    const nimi = 'Pekka'
    const ika = 10
        
    return [
    <div>
        <h1>Greetings</h1>
        <Hello name="Maya" age={26+10}/>
        <Hello name={nimi} age={ika}/>
    </div>
    ]
}

ReactDOM.render(<App />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
