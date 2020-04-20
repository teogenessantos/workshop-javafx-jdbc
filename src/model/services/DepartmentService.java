package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> listDepartments = new ArrayList<>();
		listDepartments.add(new Department(1,"Books"));
		listDepartments.add(new Department(2,"Computers"));
		listDepartments.add(new Department(3,"Eletronics"));
		
		return listDepartments;				
	}

}
