import React, {Component} from 'react'
import './SearchLeague.css'

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
                <h1>Podaj nazwę kraju oraz rok sezonu</h1>
                <form className='forma' onSubmit={this.handleSubmit}>
                <p><input type='text' placeholder='Country' name='country' onChange={this.handleInputChange}/></p>
                <p><input type='text' placeholder='Season' name='season' onChange={this.handleInputChange}/></p>
                 <button><a href={"/getFiveMostPopularById/" + this.state.country + "/" + this.state.season}>Send Message</a></button>
                </form>
            </div>
        )
    }
}

export default SearchLeague