package com.book.orm.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity

@NamedQuery(
    name = "getBooksByPrice",
    query = "from Book where price > :amount"
)

public class Book {

    @Id
    private int id;
    private String name;
    private double price;

    public Book() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}
``