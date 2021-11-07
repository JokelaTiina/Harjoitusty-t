// koulun esimerkki

import React, { useState, useEffect } from 'react';
//import axios from 'axios'
import noteService from './services/notes'
//import Note from './components/Note'

const Footer = () => {
  const footerStyle = {
    color: 'green',
    fontStyle: 'italic',
    fontSize: 16
  }
  return (
    <div style={footerStyle}>
      <br />
      <em>Note app, Department of Computer Science, University of Helsinki 2019</em>
    </div>
  )
}

const App = () => {
  const [notes, setNotes] = useState([])
  const [newNote, setNewNote] = useState('')
  const [showAll, setShowAll] = useState(true)
  const [errorMessage, setErrorMessage] = useState('some error happened...')

  useEffect(() => {
    noteService
      .getAll()
        .then(initialNotes => {
        setNotes(initialNotes)
      })
  }, [])

  const toggleImportanceOf = id => {
    const note = notes.find(n => n.id === id)
    const changedNote = { ...note, important: !note.important }

    noteService
      .update(changedNote)
      .then(returnedNote => {
        setNotes(notes.map(note => note.id !== id ? note : returnedNote))
    })
    .catch(error => {
      setErrorMessage(
        `Note '${note.content}' updating not succeeded!`
      )
      setTimeout(() => {
        setErrorMessage(null)
      }, 5000)
      setNotes(notes.filter(n => n.id !== id))
    })
  }

  const Notification = ({ message }) => {
    if(message === null) {
      return null
    }

    return (
      <div className="error">
        {message}
      </div>
    )
  }

  const addNote = (event) => {
    event.preventDefault()
    const noteObject = {
      content: newNote,
      date: new Date().toISOString(),
      important: Math.random() > 0.5,
    }
    
    noteService
      .create(noteObject)
      .then(returnedNote => {
        setNotes(notes.concat(returnedNote))
        setNewNote('')
      })
  }
  
  //Jos tilan arvo showAll on epätosi, muuttuja notesToShow:n arvoksi tulee vain tärkeät muistiinpanot
  const notesToShow = showAll 
    ? notes 
    : notes.filter(note => note.important === true)
   // notes.filter(note => note.important) Lyhyemmässä muodossa  

  const rows = () => notesToShow.map(note =>
    <Note
      key={note.id}
      note={note}
      toggleImportance = {() => toggleImportanceOf(note.id)}
    />
  )

  const handleNoteChange = (event) => {
    //console.log(event.target.value)
    setNewNote(event.target.value)
  }

  const Note = ({ note, toggleImportance }) => {
    const label = note.important
      ? 'make not important' : 'make important'

      return (
        <li className='note'>
          {note.content}
          <button onClick={toggleImportance}>{label}</button>
        </li>
    )
  }

  return (
    <div>
      <h1>Notes</h1>
      <Notification message={errorMessage} />
      
      <div>
        <button onClick={() => setShowAll(!showAll)}>
          show {showAll ? 'important' : 'all'}  
        </button>
      </div>
      <ul>
        {rows()} 
      </ul>

      <form onSubmit={addNote}>
        <input 
          value={newNote} 
          onChange={handleNoteChange}  
        />
        <button type="submit">save</button>
      </form>
      <Footer />
    </div>
  )
}

export default App

/* import React, { useState, useEffect } from 'react';
//import axios from 'axios'
import noteService from './services/notes'
//import Note from './components/Note'

const App = () => {
  const [notes, setNotes] = useState([])
  const [newNote, setNewNote] = useState('')
  const [showAll, setShowAll] = useState(true)

  useEffect(() => {
    noteService
      .getAll()
        .then(initialNotes => {
        setNotes(initialNotes)
      })
  }, [])

  const toggleImportanceOf = id => {
    const note = notes.find(n => n.id === id)
    const changedNote = { ...note, important: !note.important }

    noteService
      .update(id, changedNote)
      .then(returnedNote => {
        setNotes(notes.map(note => note.id !== id ? note : returnedNote))
    })
    .catch(error => {
      alert(
        `Something with '${note.content}' went wrong!`
      )
      setNotes(notes.filter(n => n.id !== id))
    })
  }

  const addNote = (event) => {
    event.preventDefault()
    const noteObject = {
      content: newNote,
      date: new Date().toISOString(),
      important: Math.random() > 0.5,
    }
    
    noteService
      .create(noteObject)
      .then(returnedNote => {
        setNotes(notes.concat(returnedNote))
        setNewNote('')
      })
  }
  
  //Jos tilan arvo showAll on epätosi, muuttuja notesToShow:n arvoksi tulee vain tärkeät muistiinpanot
  const notesToShow = showAll 
    ? notes 
    : notes.filter(note => note.important === true)
   // notes.filter(note => note.important) Lyhyemmässä muodossa  

  const rows = () => notesToShow.map(note =>
    <Note
      key={note.id}
      note={note}
      toggleImportance = {() => toggleImportanceOf(note.id)}
    />
  )

  const handleNoteChange = (event) => {
    //console.log(event.target.value)
    setNewNote(event.target.value)
  }

  const Note = ({ note, toggleImportance }) => {
    const label = note.important
      ? 'make not important' : 'make important'

      return (
        <li className='note'>
          {note.content}
          <button onClick={toggleImportance}>{label}</button>
        </li>
    )
  }

  return (
    <div>
      <h1>Notes</h1>
      <div>
        <button onClick={() => setShowAll(!showAll)}>
          show {showAll ? 'important' : 'all'}  
        </button>
      </div>
      <ul>
        {rows()} 
      </ul>
      <form onSubmit={addNote}>
        <input 
          value={newNote} 
          onChange={handleNoteChange}  
        />
        <button type="submit">save</button>
      </form>
    </div>
  )
}

export default App */




/* import React, { useState, useEffect } from 'react';
import axios from 'axios'
import Note from './components/Note'

const App = () => {
  const [notes, setNotes] = useState([])
  const [newNote, setNewNote] = useState('')
  const [showAll, setShowAll] = useState(true)

  useEffect(() => {
    console.log('effect')
    axios
      .get('http://localhost:3001/notes')
      .then(response => {
        console.log('promise fulfilled')
        setNotes(response.data)
      })
  }, [])
  console.log('render', notes.length, 'notes')

  //Jos tilan arvo showAll on epätosi, muuttuja notesToShow:n arvoksi tulee vain tärkeät muistiinpanot
  const notesToShow = showAll 
    ? notes 
    : notes.filter(note => note.important === true)
   // notes.filter(note => note.important) Lyhyemmässä muodossa

  const rows = () => notesToShow.map(note =>
    <Note
      key={note.id}
      note={note}
    />
  )

  const addNote = (event) => {
    event.preventDefault()
    const noteObject = {
      content: newNote,
      date: new Date().toISOString(),
      important: Math.random() > 0.5,
      id: notes.length + 1,
    }
    
    setNotes(notes.concat(noteObject))
    setNewNote('can add a new note now!')
  }

  const handleNoteChange = (event) => {
    console.log(event.target.value)
    setNewNote(event.target.value)
  }

  return (
    <div>
      <h1>Notes</h1>
      <div>
        <button onClick={() => setShowAll(!showAll)}>
          show {showAll ? 'important' : 'all'}  
        </button>
      </div>
      <ul>
        {rows()}
      </ul>
      <form onSubmit={addNote}>
        <input 
          value={newNote} 
          onChange={handleNoteChange}  
        />
        <button type="submit">save</button>
      </form>
    </div>
  )
}

export default App */
