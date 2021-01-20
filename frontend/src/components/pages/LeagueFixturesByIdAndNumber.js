import React, { useState, useEffect } from 'react'
import '../../App.css';
import axios from '../../axios-notebook';
import '../LeagueFixturesByIdAndNumber.css';
 
 
function LeagueFixturesByIdAndNumber() {
 
    var url2 = `${window.location.href}`
    var pathname = new URL(url2).pathname;
    var newUrl = pathname.substring(15)
    var newUrl1 = ""
    var newUrl2 = ""
    for(var i=0; i < newUrl.length; i++){
        if(newUrl.charAt(i) === "/"){
            newUrl1 = newUrl.substring(0,i)
            newUrl2 = newUrl.substring(i+1)
        }
    }
 
    const id = newUrl1
    const number = newUrl2
    const url = `/getFixtureByLeagueId/${id}/${number}`
    const [fixtureList, setLeagueSearchList] = useState(null)
    let content = null

    useEffect(() => {
        axios.get(url)
        .then(response =>{
            setLeagueSearchList(response.data)
        })
    }, [url])
 
    function saveFixture(fixture) {
        const fixtureObject = {'homeTeam' : fixture.homeTeam.team_name,
          'awayTeam': fixture.awayTeam.team_name,
          'fullScore' : fixture.score.fulltime,
          'eventDate' : fixture.event_date,
          'homeTeamLogo': fixture.homeTeam.logo,
          'awayTeamLogo': fixture.awayTeam.logo}
        axios.post('/saveFixture', fixtureObject);
    }
 
    if(fixtureList){
        content=
        <div>
            {fixtureList.map((fixture)=>{
                return<div className="container">
                        <div className="main_card">
                            <div className="left_card">
                                <img src={fixture.homeTeam.logo} className="round"/>
                                <p>{fixture.homeTeam.team_name}</p>
                            </div>
                            <div className="center_card">
                                <p>Event Date: {fixture.event_date}</p>
                                <h1>VS</h1>
                                <p className="fullscore">Full Score: {fixture.score.fulltime}</p> 
                            </div>
                            <div className="right_card"> 
                            <img src={fixture.awayTeam.logo} className="round"/>
                            <p>{fixture.awayTeam.team_name}</p>
                            </div>
                            </div>
                        <button onClick={() => saveFixture(fixture)} className="save_button">Save</button>
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
 
export default LeagueFixturesByIdAndNumber;