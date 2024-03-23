import React from 'react'
import { Link } from 'react-router-dom'

function NavBar() {
  return (
    <div className='navbar-a'>
      <div className='navbar-b1'>
        LOGO
      </div>
        <Link to='/explore'>
            Explore
        </Link>
        <Link to='/explore/23'>
            Explore2
        </Link>
        <Link to='/explore/dfwscasfx'>
            Explore3
        </Link>
      <Link to='/user' className='navbar-b2'>
        User
      </Link>
    </div>
  )
}

export default NavBar
