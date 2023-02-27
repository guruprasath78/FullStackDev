import { Paper } from '@mui/material';
import React, { useState } from 'react'
import { useParams } from 'react-router-dom';
import './Login.css';
import Popup from 'reactjs-popup'


export default function Login() {
  const[Firstname,setFirstname]=useState('');
    const[Lastname,setLastname]=useState('');
    const[emailid,setemailid]=useState('');
    const[phonenumber,setphonenumber]=useState('');
    const[password,setpassword]=useState('');
  const paperStyle={padding:'20px 20px', width:600,margin:"20px auto"}
  const[LoginDetails,setLoginDetails]=useState([]);
  const{ id }=useParams();
  const updatedb=(e)=>{
    const details={Firstname,Lastname,emailid,phonenumber,password}
    fetch(`http://localhost:6565/putsignup?id=${e}`,{
      method:"PUT",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(details)
    }
    ).then(()=>{
      console.log("Detail Updated");
      // console.log(JSON.stringify(details));
      // console.log(e);

    })
}
  const deletesignup=async(id)=>{
    fetch(`http://localhost:6565/deletesignup?id=${id}`,{
      method: 'DELETE'
    }).then(response => {
        console.log("deleted")
      })
      .catch(error => {
        // handle the error
      })
    }
    const updateState=(list)=>
    {
        setFirstname(list.Firstname)
        setLastname(list.Lastname)
        setemailid(list.emailid)
        setphonenumber(list.phonenumber)
        setpassword(list.password)
        console.log(Firstname,Lastname,emailid,phonenumber,password)
    }
  const getalldetails=(()=>{
    fetch("http://localhost:6565/getsignup")
    .then(e=>e.json())
    .then((eve)=>{
      setLoginDetails(eve);
    })
  })

  return (
    <div className='details'>
        <button onClick={getalldetails}>Get SignUp Details</button>
        
        {LoginDetails.map(post=>(
          <Paper className='list' elevation={10} sx={{ width: '75%' }} style={paperStyle} key={post.id}>
          
            ID:&ensp;{post.id}&ensp;&ensp;&ensp;
            Firstname:&ensp;{post.Firstname}&ensp;&ensp;&ensp;
            Lastname:&ensp;{post.Lastname}&ensp;&ensp;&ensp;
            Email:&ensp;{post.emailid}&ensp;&ensp;&ensp;
            PhoneNumber:&ensp;{post.phonenumber}&ensp;&ensp;&ensp;
            Password:&ensp;{post.password}&ensp;&ensp;&ensp;
            <Popup trigger=

                {<button onClickCapture={()=>{updateState(post)}}> Edit</button>
                } 

                modal nested>

                {
                  
                    close => (
                      <Paper className='model' elevation={15} style={paperStyle} key={post.id}>
                        <div className='modal'>
                            <div className='content'>

                            <form>
                            
  
        <p>Firstname:<input type="text" value={Firstname} placeholder="Firstname"  onChange={(e)=>setFirstname(e.target.value)} required/></p>
        <p>Lastname:<input type="text" value={Lastname} placeholder="Lastname"   onChange={(e)=>setLastname(e.target.value)} required/></p>
        <p> Email Id:<input type="text" value={emailid} placeholder="emailid"   onChange={(e)=>setemailid(e.target.value)} required/></p>
        <p> PhoneNumber:<input type="text" value={phonenumber} placeholder="phonenumber"   onChange={(e)=>setphonenumber(e.target.value)} required/></p>
        <p>password:<input type="password" value={password} placeholder="password"  onChange={(e)=>setpassword(e.target.value)} required/></p>
        
        </form>

                            </div>

                            <div>
                          <center>
                                <button onClick=

                                    {() => {updatedb(post.id);close()}}>

                                        Update

                                </button>
                                </center>
                            </div>

                        </div>
                      </Paper>
                    )

                }

            </Popup>

            {/* <button onClick={()=>{Edit(post)}}>Edit</button>&ensp;&ensp;&ensp; */}
            <button onClick={()=>{deletesignup(post.id);}}>Delete</button><br/>
          </Paper>
//onClick={Edit(post.find(item => item.id === post.id))}
        ))}
    </div>
  )
}
