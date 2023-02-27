import React, { useState } from 'react'
import './signup.css';

export default function Signup() {
    const[Firstname,setFirstname]=useState('');
    const[Lastname,setLastname]=useState('');
    const[emailid,setemailid]=useState('');
    const[phonenumber,setphonenumber]=useState('');
    const[password,setpassword]=useState('');
    const senddb=(e)=>{
            e.preventDefault()
            const details={Firstname,Lastname,emailid,phonenumber,password}
            fetch("http://localhost:6565/postsignup",{
              method:"POST",
              headers:{"Content-Type":"application/json"},
              body:JSON.stringify(details)
            }
            ).then(()=>{
              console.log("New Detail Added");
              // console.log(JSON.stringify(details));
              // console.log(e);

            })
        }
    
  return (
    <div>

        <form>
        <p>Firstname:<input type="text" value={Firstname} placeholder="Firstname" onChange={(e)=>setFirstname(e.target.value)}/></p>
        <p>Lastname:<input type="text" value={Lastname} placeholder="Lastname" onChange={(e)=>setLastname(e.target.value)}/></p>
        <p> Email Id:<input type="text" value={emailid} placeholder="emailid" onChange={(e)=>setemailid(e.target.value)}/></p>
        <p> PhoneNumber:<input type="text" value={phonenumber} placeholder="phonenumber" onChange={(e)=>setphonenumber(e.target.value)}/></p>
        <p>password:<input type="password" value={password} placeholder="password" onChange={(e)=>setpassword(e.target.value)}/></p>
        <center><button type='submit' onClick={senddb}>Post Data</button></center>
        </form>
    </div>
  )
}
