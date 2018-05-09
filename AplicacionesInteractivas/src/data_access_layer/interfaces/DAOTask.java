package data_access_layer.interfaces;

import java.util.List;

import business_layer.business_objects.Task;

public interface DAOTask {
	
	public void create(Task task);
	public void update(Task task);
	public void delete(Task task);
	public List<Task> toList();
	public Task taskById(Integer id);
	public Integer size();

}
