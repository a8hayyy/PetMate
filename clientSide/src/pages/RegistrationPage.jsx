import React,{useState, useEffect} from 'react'
import '../App.css'

function RegistrationPage() {
  const [isLog, setIsLog] = useState(true)
  const functions =()=>{
    setIsLog(false)
  }
  const functionss =()=>{
    setIsLog(true)
  }
  return (
    <>
      {isLog? 
        (<div>
        <div class="wrapper">
      <h2>Registration</h2>
      <form >
        <div class="input-box">
          <input type="text" placeholder="Enter your name" required></input>
        </div>
        <div class="input-box">
          <input type="text" placeholder="Enter your email" required></input>
        </div>
        <div class="input-box">
          <input type="phonenumber" placeholder="Enter phone number" required></input>
        </div>
        <div class="input-box">
          <input type="password" placeholder="pincode" required></input>
        </div>
        <div class="policy">
          <input type="checkbox"></input>
          <h3>Have pet</h3>
        </div>
        <div class="policy">
          <input type="checkbox"></input>
          <h3>I accept all terms & condition</h3>
        </div>
        <div class="input-box button">
          <input type="Submit" value="Verify Number"></input>
        </div>
        <div class="text">
          <h3>Already have an account?</h3> <button onClick={functions}>Login now</button>
        </div>
      </form>
    </div>
      </div>)
      :(
        <div class="wrapper">
        <h2>Login</h2>
        <form >
          <div class="input-box">
            <input type="phonenumber" placeholder="Enter phone number" required></input>
          </div>
          <div class="input-box">
            <input type="password" placeholder="pincode" required></input>
          </div>
          <div class="input-box button">
            <input type="Submit" value="Verify Number"></input>
          </div>
          <div class="text">
            <h3>Don't have an account?</h3> <button onClick={functionss}>SignUp</button>
          </div>
        </form>
      </div>
      )      
      }
    </>
  )
}

export default RegistrationPage
