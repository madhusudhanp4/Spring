package com.hexaware.ems.dao;

import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Session;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.util.HibernateUtil;


public class EmployeeDaoImp implements IEmployeeDao {


	@Override
	public int addEmp(Employee emp) {

			
		int count=0;
		
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			Transaction tx = session.beginTransaction();
			
			
			
			session.save(emp);
			
			tx.commit();
			
			session.close();
			
			count = 1;
	

		return count;

	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByEid(int eid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getByEid(int eid) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Employee> getAllEmployees() {

    List<Employee> list = null;

        Session session = HibernateUtil.getSessionFactory().openSession();

        list = session.createQuery("from Employee", Employee.class).list();

        session.close();


    return list;
}


}
