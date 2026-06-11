function BookCard(props) {
  return (
    <div>
        <p> title : {props.title}</p>
        <p> Author: {props.author}</p>
        <p> Price: ₹{props.price}</p>
      </div>
  );
}

export default BookCard;