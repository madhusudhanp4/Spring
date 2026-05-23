package com.book.orm.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.book.orm.crud.entity.Book;

public class App {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Book b1 = new Book();
        b1.setId(1);
        b1.setName("Java");
        b1.setPrice(500);

        Book b2 = new Book();
        b2.setId(2);
        b2.setName("Python");
        b2.setPrice(400);

        Book b3 = new Book();
        b3.setId(3);
        b3.setName("C++");
        b3.setPrice(300);

        Book b4 = new Book();
        b4.setId(4);
        b4.setName("Spring");
        b4.setPrice(700);

        session.save(b1);
        session.save(b2);
        session.save(b3);
        session.save(b4);

        tx.commit();
        session.close();
    }
}
