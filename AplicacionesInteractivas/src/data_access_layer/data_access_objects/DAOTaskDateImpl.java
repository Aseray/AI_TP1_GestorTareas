package data_access_layer.data_access_objects;

import java.util.List;

import business_layer.business_objects.TaskDate;
import data_access_layer.data.TaskDateCollection;
import data_access_layer.interfaces.DAOTaskDate;

public class DAOTaskDateImpl implements DAOTaskDate {

	@Override
	public void create(TaskDate tdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TaskDate tdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TaskDate tdate) {
		// TODO Auto-generated method
		
	}

	@Override
	public TaskDate taskDateById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer size() {

		Integer size = TaskDateCollection.getTaskdatelist().size();
		
		return size;
	}

	@Override
	public List<TaskDate> toList() {
		
		List<TaskDate> list = TaskDateCollection.getTaskdatelist();
		
		return list;
	}

}
