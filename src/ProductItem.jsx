import React, { Component } from 'react';

export default class ProductItem extends Component {
    render() {
        return (
            <li className="list-group-item list-group-item-dark d-flex justify-content-between">
                <span>{this.props.obj.name}</span>
                <span>₹{this.props.obj.price}</span>
            </li>
        );
    }
}
