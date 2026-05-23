package com.book.orm.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.book.orm.crud.entity.Book;

public class HibernateSelectQueriesDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Query<Book> query = session.createQuery(
                "from Book where price > :amount",
                Book.class
        );

        query.setParameter("amount", 300.0);

        List<Book> list = query.getResultList();

        list.forEach(System.out::println);

        session.close();
    }
}
