import { useState } from "react";
import BookCard from "./BookCard";

function BookList() {

    const [view, setView] = useState("grid");

    const [search, setSearch] = useState("");

    const books = [
        {
            id: 1, title: "Java", author: "Raju", price: "6500"
        },

        {
            id: 2, title: "python", author: "Ravi", price: "4500"
        }
    ]

    function toggleView() {

        if (view === "grid") {
            setView("list");
        } else {
            setView("grid");
        }
    }

    const filteredBooks = books.filter((book) =>
        book.title.toLowerCase().includes(search.toLowerCase())
    );

    return (
        <div>

            <input
                type="text"
                placeholder="Search books..."
                value={search}
                onChange={(e) => setSearch(e.target.value)} />


            <button onClick={toggleView}>
                Switch to {view === "grid" ? "List" : "Grid"} View
            </button>


            <div style={{ display: view === "grid" ? "flex" : "block" }} >
                {filteredBooks.map((book) => (

                    <BookCard
                        key={book.id}
                        title={book.title}
                        author={book.author}
                        price={book.price} />
                ))}

            </div>



        </div>
    )
}

export default BookList;