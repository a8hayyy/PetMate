import './App.css';
import { BrowserRouter as Router, Routes, Route, useLocation } from 'react-router-dom';
// import PetPage from './pages/PetPage'
import UserPage from './pages/UserPage'
import RegistrationPage from './pages/RegistrationPage'
import UserIRP from './pages/invalidroutepages/UserIRP'
import HomePage from './pages/HomePage'
import DefaultIRP from './pages/invalidroutepages/DefaultIRP'

function App() {
  // const location = useLocation();
  // const {pathname} = location;
  // const isHomePage = pathname === '/';
  // console.log(pathname);

  return (
    <Router>
      <Routes>
        <Route exact path='/' element={<HomePage />} />
        <Route exact path="/user" element={<RegistrationPage />}/>
        <Route exact path="/user/:id" element={<UserPage />} />
        <Route path="/user/*" element={<UserIRP />} />
        <Route path="/*" element={<DefaultIRP />} />
      </Routes>
    </Router>
  );
}

export default App;
