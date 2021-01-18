import React from 'react'
import { Link } from 'react-router-dom'
function CardItem(props) {

    const ColoredLine = ({ color }) => (
        <hr
            style={{
                color: color,
                backgroundColor: color,
                height: 2
            }}
        />
    );
    return (
    <>
    <li className="cards__item_mp">
        <Link className="cards__item__link_mp" to={props.path}>
            <figure className="cards__item__pic-wrap_mp" data-category={props.label}>
                <img src={props.src} alt="Football image" className="cards__item__img_mp"/>
            </figure>
            <ColoredLine color="blue" />
            <div className="cards__item__info_mp">
                <h5 className="cards__item__text_mp">{props.text}</h5>
            </div>
        </Link>
    </li>
    </>
    )
}

export default CardItem
