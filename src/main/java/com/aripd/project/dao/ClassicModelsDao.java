package com.aripd.project.dao;

import java.util.List;

import com.aripd.project.entity.Customer;
import com.aripd.project.entity.Employee;
import com.aripd.project.entity.Office;

public interface ClassicModelsDao<T> {
	public void create(T entity);

	public void update(T entity);

	public T find(Object id);

	public List<T> findAll();

	public void delete(T entity);

	public List<T> findRange(int start, int end);

	public int count();

}
