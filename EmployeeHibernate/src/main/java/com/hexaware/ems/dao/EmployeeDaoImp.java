package com.hexaware.ems.dao;

import org.hibernate.Transaction;

import java.util.List;

import javax.persistence.Query;

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

		Employee emp = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        emp = session.get(Employee.class, eid);   // ✅ fetch by primary key

        session.close();

        return emp;
	}


	@Override
	public List<Employee> getAllEmployees() {
		

        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query query = session.createQuery("from Employee", Employee.class);
        
        List<Employee> list = query.getResultList();
        session.close();


    return list;
}


}
