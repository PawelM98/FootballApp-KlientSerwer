import React, { useState, useEffect } from 'react'
import '../../App.css';
import Footer from '../Footer';
import axios from 'axios';
import MostPopularCardItem from '../MostPopularCardItem'
import '../MostPopularLeagues.css'


function FiveMostPopular() {


    var url2 = `${window.location.href}`
    var pathname = new URL(url2).pathname;
    var newUrl = pathname.substring(24)
    var newUrl1 = ""
    var newUrl2 = ""
    for(var i=0; i < newUrl.length; i++){
        if(newUrl.charAt(i) === "/"){
            newUrl1 = newUrl.substring(0,i)
            newUrl2 = newUrl.substring(i+1)
        }
    }

    const country = newUrl1
    const season = newUrl2
    const url = `http://localhost:8080/findLeaguesByCountryAndSeason/${country}/${season}`
    const [leaguesSearchList, setLeagueSearchList] = useState(null)
    let content = null

    useEffect(() => {
        axios.get(url)
        .then(response =>{
            setLeagueSearchList(response.data)
        })
    }, [url])

    if(leaguesSearchList){
        content=
        <div>
                {leaguesSearchList.map((leauge)=>{
                    return         <MostPopularCardItem
                    src={leauge.logo}
                    text={leauge.country}
                    label={leauge.name}
                    path={"/getFiveMostPopularById/"+leauge.league_id}
                />
                })}
        </div>
    }

    return(
        <>
            <div className="cards__container_mp">
                <div className="cards__Wrapper_mp">
                        {content}
                </div>
            </div>
            <Footer/>
        </>
    )
}

export default FiveMostPopular;