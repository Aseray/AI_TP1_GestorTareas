package data_access_layer.interfaces;

import java.util.List;

import business_layer.business_objects.Employee;

public interface DAOEmployee {
	
	public void create(Employee emp);
	public void update(Employee emp);
	public void delete(Employee emp);
	public List<Employee> toList();
	public Employee employeeById(Integer id);
	public Integer size();

}






