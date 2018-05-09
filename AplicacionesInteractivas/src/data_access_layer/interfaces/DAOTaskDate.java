package data_access_layer.interfaces;

import java.util.List;

import business_layer.business_objects.TaskDate;

public interface DAOTaskDate {
	
	public void create(TaskDate tdate);
	public void update(TaskDate tdate);
	public void delete(TaskDate tdate);
	public List<TaskDate> toList();
	public TaskDate taskDateById(Integer id);
	public Integer size();

}
