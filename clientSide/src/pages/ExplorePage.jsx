// ExplorePage.js
import { useState } from 'react';
import { useParams, Routes, Route, Link } from 'react-router-dom';
import MyPets from '../components/MyPets'

function ExplorePage() {
  const [showMyPets, setShowMyPets] = useState(false); // State to track whether to show my pets

  const handleToggleMyPets = () => {
    setShowMyPets(!showMyPets); // Toggle the state to show/hide my pets
  };

  return (
    <div>
      <h1>Explore Page</h1>
      <div>
        <button onClick={handleToggleMyPets}>
          {showMyPets ? 'Hide My Pets' : 'Show My Pets'}
        </button>
      </div>
      <div>
        {showMyPets && (
            <MyPets/>
        )}
        {!showMyPets && (
          <h2>All Pet List</h2>
        )}
      </div>

    </div>
  );
}

export default ExplorePage;
