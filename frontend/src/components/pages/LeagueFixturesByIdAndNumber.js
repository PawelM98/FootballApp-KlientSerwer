import React, { useState, useEffect } from 'react'
import '../../App.css';
import Footer from '../Footer';
import axios from 'axios';
import MostPopularCardItem from '../MostPopularCardItem'
import '../MostPopularLeagues.css'
 
 
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
    const url = `http://localhost:8080/getFixtureByLeagueId/${id}/${number}`
    const [fixtureList, setLeagueSearchList] = useState(null)
    let content = null
 
    useEffect(() => {
        axios.get(url)
        .then(response =>{
            setLeagueSearchList(response.data)
        })
    }, [url])
 
    function saveFixture(fixture) {
        const fixtureObject = {'homeTeam' : fixture.homeTeam.team_name, 'awayTeam': fixture.awayTeam.team_name, 'fullScore' : fixture.score.fulltime}
        axios.post('http://localhost:8080/saveFixture', fixtureObject);
    }
 
    if(fixtureList){
        content=
        <div>
                {fixtureList.map((fixture)=>{
                    return <div style={{border: '1px solid red'}}>
                        <p>Home Team: {fixture.homeTeam.team_name}</p>
                        <p>Away Team: {fixture.awayTeam.team_name}</p>
                        <p>Score Fulltime: {fixture.score.fulltime}</p>
                        <button onClick={() => saveFixture(fixture)}>Zapisz</button>
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
 
export default LeagueFixturesByIdAndNumber;