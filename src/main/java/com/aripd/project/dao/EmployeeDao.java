package com.aripd.project.dao;

import java.util.List;

import com.aripd.project.entity.Employee;
import com.aripd.project.util.EmployeeQueryData;

public interface EmployeeDao extends ClassicModelsDao<Employee> {
	public Employee getEmployeeWithCustomers(Integer id);
	public List<Employee> findRange(int start, int end);
	public void findEmployees(EmployeeQueryData data);
	public List<Employee> findManagers();
}
