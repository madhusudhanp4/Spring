package com.book.orm.crud;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.book.orm.crud.entity.Book;

public class ProjectionAggregationCriteriaDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Double> cq = cb.createQuery(Double.class);

        Root<Book> root = cq.from(Book.class);

        cq.select(cb.max(root.get("price")));

        Double max = session.createQuery(cq).getSingleResult();

        System.out.println("Max Price: " + max);

        session.close();
    }
}
