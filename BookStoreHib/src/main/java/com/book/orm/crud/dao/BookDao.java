package com.book.orm.crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.book.orm.crud.HibernateUtil;
import com.book.orm.crud.entity.Book;

public class BookDao {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();

    // Named Query
    public List<Book> getBooksByPrice() {

        Query<Book> query = session.createNamedQuery(
                "getBooksByPrice",
                Book.class
        );

        query.setParameter("amount", 300.0);

        return query.getResultList();
    }

    // HQL Query
    public List<Book> getAllBooksHQL() {

        Query<Book> query = session.createQuery(
                "from Book where price > :amount",
                Book.class
        );

        query.setParameter("amount", 300.0);

        return query.getResultList();
    }
}
