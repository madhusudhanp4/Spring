import { Component } from "react";
import ProductItem from "./ProductItem";

export default class ProductListComponent extends Component {

    listItems() {
        if (this.props.data instanceof Array) {

            return this.props.data.map((object, i) => (
                <ProductItem obj={object} key={i} />
            ));
        }
        return null;
    }

    render() {
        return (
            <div className='container col-md-4'>


                <h3 className="bg-dark text-white p-2">Products List</h3>


                <div className="bg-dark text-white d-flex p-2 fw-bold">
                    <div style={{ width: "20%" }}>Id</div>
                    <div style={{ width: "50%" }}>Name</div>
                    <div style={{ width: "30%" }}>Price</div>
                </div>


                <ul className="list-group">
                    {this.listItems()}
                </ul>

            </div>
        );
    }
}