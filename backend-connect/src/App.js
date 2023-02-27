
import './App.css';
import Signup from './Components/Signup';
import { BrowserRouter, Routes, Route,redirect } from "react-router-dom";
import Login from './Components/Login';
import Pop from './External Ref/pop';

function App() {
  return (
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<><Signup></Signup><Login></Login></>} />
    <Route path="/pop" element={<Pop></Pop>} />
    </Routes>
    </BrowserRouter>
  );
}

export default App;
