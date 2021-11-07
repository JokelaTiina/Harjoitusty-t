import React, { useState } from 'react'
import ReactDOM from 'react-dom';

const Button = (props) => (
    <button onClick={props.handleClick}>
        {props.text}
    </button>
)

const Statistics = props => <><table style={{width:'10%'}}> 
                                <tbody>
                                    <tr>
                                        <td style={{width:'73%'}}>{props.text}:</td>
                                        <td>{props.value}</td>   
                                    </tr>
                                </tbody>
                            </table></>

const History = (props) => {
    //console.log(props)
    if(props.good===0 && props.neutral===0 && props.bad===0){
        return (
            <div>no feedback given yet</div>
        )        
    }
    return <div>
                  <Statistics text="good" value={props.good} />
            <br /><Statistics text="neutral" value={props.neutral} />
            <br /><Statistics text="bad" value={props.bad} />
            <br /><Statistics text="all" value={props.all} /> 
            <br /><Statistics text="average" value={(props.good*1 + props.neutral*0 + props.bad*-1/props.all)} />
            <br /><Statistics text="positive" value={(props.good*100)/props.all} />
            </div>
}    

const App = () => {
    // tallenna napit omaan tilaansa
    const [good, setGood] = useState(0)
    const [neutral, setNeutral] = useState(0)
    const [bad, setBad] = useState(0)
    const all = good + neutral +bad
        
return (
    <div>
        <h2>Give feedback!</h2>
        <Button handleClick={() => setGood(good + 1)} text='good'/>
        <Button handleClick={() => setNeutral(neutral + 1)} text='neutral'/>
        <Button handleClick={() => setBad(bad + 1)} text='bad'/> 
        <br /> 
        <br />
        <br /> 
        <h2>statistic:</h2>        
        <History good={good} neutral={neutral} bad={bad} all={all}/> 
    </div>
    )
}

ReactDOM.render(<App />, document.getElementById('root'));





