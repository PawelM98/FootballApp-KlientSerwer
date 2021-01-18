import React from 'react'
import '../App.css'
import { Button } from './Button'
import './HeroSection.css'
import MostPopularLeagues from './MostPopularLeagues'

function HeroSection() {
    return (
        <div className='hero-container'>
            <video src="/videos/bramka.mp4" autoPlay loop muted/>
            <h1>MOST POPULAR LEAGUES IN EUROPE</h1>
                <MostPopularLeagues/>
            </div>
    )
}

export default HeroSection
