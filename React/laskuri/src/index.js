import React, {useState} from 'react';
import ReactDOM from 'react-dom';
// import './index.css';
// import App from './App';
//import * as serviceWorker from './serviceWorker';

const Display = ({counter}) =>  <div>{counter}</div>
   
const App = (props) => {
    const [counter, setCounter] = useState(0)
    const setToValue = (value) => setCounter(value)

    return (
        <div>
            <Display counter={counter}/>
            <button onClick={() => setToValue(counter + 1)}>
            <div>{counter}</div>
                plus
            </button>
            <button onClick={() => setToValue(0)}>
                zero
            </button>
        </div>
    )
}

let counter = 1

ReactDOM.render(<App counter={counter} />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA

