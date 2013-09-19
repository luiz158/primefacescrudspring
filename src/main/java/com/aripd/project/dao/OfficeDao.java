package com.aripd.project.dao;

import com.aripd.project.entity.Office;

public interface OfficeDao extends ClassicModelsDao<Office> {
	public Office getOfficeWithEmployees(Integer id);
}
