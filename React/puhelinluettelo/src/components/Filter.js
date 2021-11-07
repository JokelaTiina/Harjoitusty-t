// testattu komponentin toiminta eri tiedostosta käsin

import React from 'react'

  const Filter = ( {toFind, search, handleToFindChange} ) => {
    return (
      <div> 
        <form onSubmit={search}>     
          <input value={toFind} onChange={handleToFindChange} /> 
      </form>     
    </div>
    )
  }

  export default Filter