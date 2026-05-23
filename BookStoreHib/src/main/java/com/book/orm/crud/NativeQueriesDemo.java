package com.book.orm.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.book.orm.crud.entity.Book;

public class NativeQueriesDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        NativeQuery<Book> query = session.createNativeQuery(
                "SELECT * FROM Book WHERE price > ?",
                Book.class
        );

        query.setParameter(1, 300);

        List<Book> list = query.getResultList();

        list.forEach(System.out::println);

        session.close();
    }
}