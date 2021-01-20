import React, { useState, useEffect, useForceUpdate } from 'react'
import '../../App.css';
import axios from '../../axios-notebook';
import '../MostPopularLeagues.css'
import '../SavedFixtures.css'
 
 
function SavedFixture() {
 

    const url = '/getFixtures'
    const [fixtureListFromDb, setfixtureListFromDb] = useState(null)
    let content = null
 
    useEffect(() => {
        axios.get(url)
        .then(response =>{
            setfixtureListFromDb(response.data)
        })
    }, [url])
 
    function deleteFixture(id) {
        axios.delete(`/deleteFixture/${id}`);
        window.location.reload(false);
    }

    if(fixtureListFromDb){
        content=
        <div>
                {fixtureListFromDb.map((fixture)=>{
                    return <div className="container">
                    <div className="main_card">
                        <div className="left_card">
                            <img src={fixture.homeTeamLogo} className="round"/>
                            <p>{fixture.homeTeam}</p>
                        </div>
                        <div className="center_card">
                            <p>Event Date: {fixture.eventDate}</p>
                            <h1>VS</h1>
                            <p className="fullscore">Full Score: {fixture.fullScore}</p> 
                        </div>
                        <div className="right_card"> 
                        <img src={fixture.awayTeamLogo} className="round"/>
                        <p>{fixture.awayTeam}</p>
                        </div>
                        </div>
                    <button onClick={() => deleteFixture(fixture.id)} className="save_button">Delete</button>
                    </div>
                })}
        </div>
    }
    return(
        <>
            <div>
                <img src="/images/boisko.jpg" className="fixtures_img"/>
                {content}
            </div>
        </>
    )
}
 
export default SavedFixture;