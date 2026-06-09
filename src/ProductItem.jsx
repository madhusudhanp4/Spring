import React, { Component } from 'react';

export default class ProductItem extends Component {
  render() {
    return (
      <li className="list-group-item list-group-item-dark text-white d-flex">

        <div style={{ width: "20%" }}>
          {this.props.obj.id}
        </div>

        <div style={{ width: "50%" }}>
          {this.props.obj.name}
        </div>

        <div style={{ width: "30%" }}>
          ₹{this.props.obj.price}
        </div>

      </li>
    );
  }
}