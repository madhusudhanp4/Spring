package com.book.orm.crud;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.book.orm.crud.entity.Book;

public class JpaCriteriaDemos {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);

        Root<Book> root = cq.from(Book.class);

        cq.select(root);

        List<Book> list = session.createQuery(cq).getResultList();

        list.forEach(System.out::println);

        session.close();
    }
}