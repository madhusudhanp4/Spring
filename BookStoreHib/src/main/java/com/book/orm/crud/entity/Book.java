package com.book.orm.crud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {   // ✅ exact name
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {   // ✅ exact name
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {   // ✅ exact name
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}