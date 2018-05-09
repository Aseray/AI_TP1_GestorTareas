package data_access_layer.data;

import java.util.ArrayList;
import java.util.List;

import business_layer.business_objects.Employee;

public class EmployeeCollection {
	
	private static List<Employee> employeelist = new ArrayList<>();

	public static List<Employee> getEmployeelist() {
		return employeelist;
	}

}
