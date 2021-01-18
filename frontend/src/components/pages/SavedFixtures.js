import React, { useState, useEffect, useForceUpdate } from 'react'
import '../../App.css';
import Footer from '../Footer';
import axios from 'axios';
import '../MostPopularLeagues.css'
import { render } from '@testing-library/react';
 
 
function SavedFixture() {
 

    const url = 'http://localhost:8080/getFixtures'
    const [fixtureListFromDb, setfixtureListFromDb] = useState(null)
    let content = null
 
    useEffect(() => {
        axios.get(url)
        .then(response =>{
            setfixtureListFromDb(response.data)
        })
    }, [url])
 
    function deleteFixture(id) {
        axios.delete(`http://localhost:8080/deleteFixture/${id}`);
        window.location.reload(false);
    }

    if(fixtureListFromDb){
        content=
        <div>
                {fixtureListFromDb.map((fixture)=>{
                    return <div style={{border: '1px solid red'}}>
                        <p>Home Team: {fixture.homeTeam}</p>
                        <p>Away Team: {fixture.awayTeam}</p>
                        <p>Score Fulltime: {fixture.fullScore}</p>
                        <button onClick={() => deleteFixture(fixture.id)}>Usuń</button>
                    </div>
                })}
        </div>
    }
    return(
        <>
            <div>
                    {content}
            </div>
            <Footer/>
        </>
    )
}
 
export default SavedFixture;