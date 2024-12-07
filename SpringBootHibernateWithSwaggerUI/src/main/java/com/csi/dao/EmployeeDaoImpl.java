package com.csi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfi
import com.csi.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory
	
	@Override
	public void signUp(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean signIn(String empEmailId, String empPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveBulkOfData(List<Employee> employees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getDataById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getDataByEmail(String empEmailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getDataByContactNumber(long empContactNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> filterData(double empSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateData(int empId, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDataById(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		
	}

}
