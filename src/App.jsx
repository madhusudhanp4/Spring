import HocExample from "./HocExample";
import StockListComponent from "./StockListComponent";
import ProductListComponent from "./ProductListComponent";






const StockData = [

        { id: 101, name: "TCS", price: 900 },

        { id: 102, name: "Reliance", price: 500 },

        { id: 103, name: "Google", price: 1500 },

        { id: 104, name: "Facebook", price: 1200 }


];



const ProductData = [
        { id: 201, name: "Laptop", price: 75000 },
        { id: 202, name: "Mobile", price: 25000 },
        { id: 203, name: "Headphones", price: 3000 },
        { id: 204, name: "Keyboard", price: 1500 }
];



const Stock = HocExample(StockListComponent, StockData);
const Product = HocExample(ProductListComponent, ProductData);


export function App(props) {



        return (

                <>
                        <h1>Welcome to App Component</h1>

                        <Stock />

                        <h2>Product List</h2>
                        <Product />




                </>


        )




}