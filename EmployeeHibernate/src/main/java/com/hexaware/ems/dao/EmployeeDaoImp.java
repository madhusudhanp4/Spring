package com.hexaware.ems.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.util.HibernateUtil;

@Repository
public class EmployeeDaoImp implements IEmployeeDao {

    @Override
    public int addEmp(Employee emp) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(emp);

        tx.commit();
        session.close();

        return 1;
    }

    @Override
    public int updateEmployee(Employee emp) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        String selectHQL = "update Employee e set e.ename = :name, e.salary = :sal where e.eid = :id";
        
        int count = session.createQuery(selectHQL)
                .setParameter("name", emp.getEname())
                .setParameter("sal", emp.getSalary())
                .setParameter("id", emp.getEid())
                .executeUpdate();

        tx.commit();
        session.close();

        return count;
    }

    @Override
    public int deleteByEid(int eid) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        int count = session.createQuery(
                "delete from Employee e where e.eid = :id")
                .setParameter("id", eid)
                .executeUpdate();

        tx.commit();
        session.close();

        return count;
    }

    @Override
    public Employee getByEid(int eid) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Employee emp = session.createQuery(
                "from Employee e where e.eid = :id", Employee.class)
                .setParameter("id", eid)
                .getSingleResult();

        session.close();

        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Employee> list =
                session.createQuery("from Employee e", Employee.class)
                .getResultList();

        session.close();

        return list;
    }
}