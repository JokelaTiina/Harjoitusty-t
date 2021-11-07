import React from 'react'

const Course = (props) => {
    const { courses } = props

    return (
        <div>        
            <Header courses={courses} />
            <Content courses={courses} /> 
            <Total courses={courses} />
        </div>     
    )
} 

const Header = (props) => {   
    const { courses } = props

    return (
        <div>
            {courses.map((course, index) => <h3 key={index}>{course.name}</h3>)}            
        </div>
    )
}

const Content = (props) => {
    const { courses } = props
    
    return (
        <div> 
            <Part courses={courses} />                     
        </div>
    )
}

const Total = (props) => {
    const { courses } = props
    
    const count = courses.map(course => 
                    course.parts.reduce( (result, {exercises} ) => result + exercises, 0))      
    
    return (        
        <div>
            <b>Number of all exercises is {count}</b>
            <br></br>         
        </div> 
    )
}     
      

const Part = (props) => {  
    const { courses } = props

    return (
        <div>
            {courses.map(course => course.parts.map(part => 
            <p key={part.id}>{part.name} {part.exercises}</p>))}                        
        </div>
    )
} 

export default Course