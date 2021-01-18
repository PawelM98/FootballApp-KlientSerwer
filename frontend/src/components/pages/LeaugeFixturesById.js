import React, { Component } from 'react'
import '../../App.css';
import Footer from '../Footer';


class LeaugeFixturesById extends Component {

    constructor(props){
        super(props);
        this.state ={
            count: 0
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

    increment = () => {
        this.setState({ count: this.state.count + 1})
    }
    
    decrement = () => {
        this.setState({ count: this.state.count - 1})
    }

    render(){
        const {count} = this.state
        return(
        <>
            <div className='main_div'>
                <h1>Choose how many Fixtures u want to get</h1>
                <h2>Fixtures Number: {count}</h2>
                <div className="center_div">
                    <div className="btn_div">
                        <button onClick={this.increment}>+</button>
                        <button onClick={this.decrement}>-</button>
                    </div>
                    <button><a href={"/LeagueFixture/"+"2"+"/"+this.state.count}>Submit</a></button>
                </div>
            </div>
            <Footer/>
        </>
        );
    }
}

export default LeaugeFixturesById;