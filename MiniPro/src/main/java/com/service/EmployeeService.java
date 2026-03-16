package com.service;

import com.dao.EmployeeDao;
import com.entity.Department;

public class EmployeeService {

	public void insertData(Department e) {
		EmployeeDao dao = new EmployeeDao();
		dao.inserData(e);
	}

	public void deleteData(int id) {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteData(id);
	}

	public void updateData(Department e) {
		EmployeeDao dao = new EmployeeDao();
		dao.updateData(e);
	}
	
	public void getSingleRecord(int id) {
		EmployeeDao dao = new EmployeeDao();
		dao.getSingleRecord(id);
	}

}
