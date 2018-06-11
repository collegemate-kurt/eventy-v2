package edu.calpoly.csc431.service;

import edu.calpoly.csc431.model.Employee;

import java.util.List;

public interface EmployeeService {
	
	void addEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void deleteEmployee(Integer employeeId);

	Employee getEmployee(int employeeid);

	Employee updateEmployee(Employee employee);

}
