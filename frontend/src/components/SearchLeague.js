import React, {Component} from 'react'
import './SearchLeague.css'
import './Footer.css';


class SearchLeague extends Component{

    constructor(props){
        super(props)
        this.state ={
            country: '',
            season: ''
        }
    }

    handleSubmit = (event) =>{
        event.preventDefault()
        const data = this.state
        console.log("Final data is:", data)
    }

    handleInputChange = (event) =>{
        event.preventDefault()
        this.setState({
            [event.target.name]: event.target.value
        })
    }

    render(){
        return(
            <div className='container'> 
            <div className='hero-container-searchleague'>
                <h1>Find Your league</h1>
                <h2>Type Country and Season below</h2>
                <form className='forma' onSubmit={this.handleSubmit}>
                <p><input className='footer-input' type='text' placeholder='Country' name='country' onChange={this.handleInputChange}/></p>
                <p><input className='footer-input' type='text' placeholder='Season' name='season' onChange={this.handleInputChange}/></p>
                 <a href={"/getFiveMostPopularById/" + this.state.country + "/" + this.state.season} className="button1">Find</a>
                </form>
                </div>
            </div>
        )
    }
}

export default SearchLeague