import React, { useState } from 'react'
import Note from './components/Note'

const App = (props) => {
  const [notes, setNotes] = useState(props.notes)
  const [newNote, setNewNote] = useState('')
  const [showAll, setShowAll] = useState(true)

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

export default App
