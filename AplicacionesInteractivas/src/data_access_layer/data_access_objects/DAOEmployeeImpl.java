package data_access_layer.data_access_objects;

import java.util.List;

import business_layer.business_objects.Employee;
import data_access_layer.data.EmployeeCollection;
import data_access_layer.interfaces.DAOEmployee;

public class DAOEmployeeImpl implements DAOEmployee {

	@Override
	public void create(Employee emp) {EmployeeCollection.getEmployeelist().add(emp);}

	@Override
	public void update(Employee emp) {
		
		
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public Employee employeeById(Integer id) {
		
		for(int i= 0;i<EmployeeCollection.getEmployeelist().size();i++) {
			if(EmployeeCollection.getEmployeelist().get(i).getId()==id)
			{return EmployeeCollection.getEmployeelist().get(i);}
		}
		
		return null;
	}

	@Override
	public Integer size() {
		
		Integer size = EmployeeCollection.getEmployeelist().size();
		
		return size;
	}

	@Override
	public List<Employee> toList() {
		
		List<Employee>list = EmployeeCollection.getEmployeelist();
		
		return list;
	}

}
