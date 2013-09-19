package com.aripd.project.service;

import java.util.List;

import com.aripd.project.entity.Employee;
import com.aripd.project.entity.Office;
import com.aripd.project.util.EmployeeQueryData;

public interface ClassicModelsService {
	public int getOfficeCount();
	public List<Office> findOffices(int start, int end);
	public Office findOffice(Object id);
	public List<Office> getAllOffices();
	public void create(Office o);
	public void edit(Office o);
	public void remove(Office o);
	
	
	public int getEmployeeCount();
	public List<Employee> findEmployees(int start, int end);
	public void findEmployees(EmployeeQueryData data);
	
	public Employee findEmployee(Object id);
	public List<Employee> findManagers();
	public List<Employee> getAllEmployees();
	public void create(Employee o);
	public void edit(Employee o);
	public void remove(Employee o);
}
