import React, { useState, useEffect } from 'react'
import '../../App.css';
import axios from '../../axios-notebook';
import FoundByCountryCardItem from '../FoundByCountryCardItem';
import '../FoundByCountryCardItem.css';
import '../FiveMostPopular.css';



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
    const url = `/findLeaguesByCountryAndSeason/${country}/${season}`
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
                    return         <FoundByCountryCardItem
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
        <div className="main_container">
        <img src="/images/boisko.jpg" className="fixtures_img"/>
            <div className="cards__container_fb">
                <div className="cards__wrapper_fb">
                    <ul className="cards__item_fb">
                        {content}
                    </ul>
                </div>
             </div>
        </div>
        </>
    )
}

export default FiveMostPopular;