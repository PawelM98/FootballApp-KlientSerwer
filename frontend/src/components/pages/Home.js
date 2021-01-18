import React from 'react';
import '../../App.css';
import Cards from '../Cards';
import Footer from '../Footer';
import HeroSection from '../HeroSection';
import SearchLeague from '../SearchLeague';

function Home() {
    return(
        <>
            <HeroSection/>
            <SearchLeague/>
            <Footer/>
        </>
    )
}

export default Home;