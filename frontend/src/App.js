import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';
import Home from './components/pages/Home';
import FiveMostPopular from './components/pages/FiveMostPopular'
import LeaugeFixturesById from './components/pages/LeaugeFixturesById';
import LeagueFixturesByIdAndNumber from './components/pages/LeagueFixturesByIdAndNumber';
import SavedFixture from './components/pages/SavedFixtures';
import Footer from './components/Footer';

function App() {
  return (
    <div className="App">
      <Router>
      <Navbar/>
      <Switch>
        <Route path='/' exact component={Home}/>
        <Route path='/getFiveMostPopularById/:country/:year' exact component ={FiveMostPopular}/>
        <Route path='/getFiveMostPopularById/:id' exact component = {LeaugeFixturesById}/>
        <Route path='/LeagueFixture/:id/:number' exact component = {LeagueFixturesByIdAndNumber}/>
        <Route path='/savedFixtures' exact component = {SavedFixture}/>
      </Switch>
      <Footer/>
      </Router>
    </div>
  );
}

export default App;
