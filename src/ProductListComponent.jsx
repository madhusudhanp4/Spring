import { Component } from "react";

export default class ProductListComponent extends Component {

    listItems() {
        if (this.props.data instanceof Array) {
            return this.props.data.map((item, i) => {
                return (
                    <li key={i}>
                        {item.id} - {item.name} - ₹{item.price}
                    </li>
                );
            });
        }
    }

    render() {
        return (
            <div className="container">
                <h3>Products List</h3>

                <ol>
                    {this.listItems()}
                </ol>

            </div>
        );
    }
}