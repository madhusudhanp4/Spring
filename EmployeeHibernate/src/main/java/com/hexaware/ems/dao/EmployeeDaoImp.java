package com.hexaware.ems.dao;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.util.HibernateUtil;


public class EmployeeDaoImp implements IEmployeeDao {


	@Override
	public int addEmp(Employee emp) {

			
		int count=0;
			Session session = HibernateUtil.getSessionFactory();
			
			Transaction tx = session.beginTransaction();
			
			session.save(emp);
			session.close();
			
	

		return count;

	}

}
