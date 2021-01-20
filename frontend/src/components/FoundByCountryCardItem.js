import React from 'react'
import { Link } from 'react-router-dom'
import './FoundByCountryCardItem.css'

function FoundByCountryCardItem(props) {

    const ColoredLine = ({ color }) => (
        <hr
            style={{
                color: color,
                backgroundColor: color,
                height: 1
            }}
        />
    );
    return (
    <>
    <li className="cards__item_fb">
        <Link className="cards__item__link_fb" to={props.path}>
            <figure className="cards__item__pic-wrap_fb" data-category={props.label}>
                <img src={props.src} alt="Football image" className="cards__item__img_fb"/>
            </figure>
            <ColoredLine color="white" />
            <div className="cards__item__info_fb">
                <h5 className="cards__item__text_fb">{props.text}</h5>
            </div>
        </Link>
    </li>
    </>
    )
}

export default FoundByCountryCardItem
