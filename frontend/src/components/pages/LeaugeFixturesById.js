import React, { Component } from 'react'
import '../../App.css';
import '../LeagueFixtureById.css'

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
        if(this.state.count <= 0){
            this.state.count = 0
        }else
        this.setState({ count: this.state.count - 1})
    }

    render(){
        const {count} = this.state
        return(
        <>
            <div className='main_div'>
                <img src="../images/boisko.jpg" className="fixtures_img"/>
                <h1>Choose how many Fixtures u want to get</h1>
                <div className="center_div">
                <h2>Fixtures Number: {count}</h2>
                    <div className="btn_div">
                        <button onClick={this.increment} className="plus_minus_button">+</button>
                        <button onClick={this.decrement} className="plus_minus_button">-</button>
                    </div>
                <a href={"/LeagueFixture/"+"2"+"/"+this.state.count} className="button1">Submit</a>
                </div>
            </div>
        </>
        );
    }
}

export default LeaugeFixturesById;