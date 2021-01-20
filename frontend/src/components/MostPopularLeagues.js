import React, { useState, useEffect } from 'react'
import MostPopularCardItem from './MostPopularCardItem'
import './MostPopularLeagues.css'
import axios from '../axios-notebook'


function MostPopularLeagues() {
    const url = '/all';
    const [leagues, setLeauge] = useState(null)

    let league1 = null
    let league2 = null
    let league3 = null
    let league4 = null
    let league5 = null

    useEffect(() => {
        axios.get(url)
        .then(response =>{
            setLeauge(response.data)
        })
    }, [url])

    if(leagues){
        league1=
        <MostPopularCardItem
        src={leagues[0].logo}
        text='Get Last 5 League Fixtures'
        label={leagues[0].name}
        path={'/LeagueFixture/'+leagues[0].league_id+'/5'}
    />
        league2=
        <MostPopularCardItem
        src={leagues[1].logo}
        text='Get Last 5 League Fixtures'
        label={leagues[1].name}
        path={'/LeagueFixture/'+leagues[1].league_id+'/5'}
    />
        league3=
        <MostPopularCardItem
        src={leagues[2].logo}
        text='Get Last 5 League Fixtures'
        label={leagues[2].name}
        path={'/LeagueFixture/'+leagues[2].league_id+'/5'}
    />
        league4=
        <MostPopularCardItem
        src={leagues[3].logo}
        text='Get Last 5 League Fixtures'
        label={leagues[3].name}
        path={'/LeagueFixture/'+leagues[3].league_id+'/5'}
    />
        league5=
        <MostPopularCardItem
        src={leagues[4].logo}
        text='Get Last 5 League Fixtures'
        label={leagues[4].name}
        path={'/LeagueFixture/'+leagues[4].league_id+'/5'}
    />
    }
    return (
            <div className="cards__container_mp">
                <div className="cards__Wrapper_mp">
                    <ul className='cards__items_mp'>
                        {league1}
                        {league2}
                        {league3}
                        {league4}
                        {league5}
                    </ul>
                </div>
            </div>
    )
}

export default MostPopularLeagues
