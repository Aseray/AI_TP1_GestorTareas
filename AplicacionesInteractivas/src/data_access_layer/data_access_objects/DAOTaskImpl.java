package data_access_layer.data_access_objects;

import java.util.List;

import business_layer.business_objects.Task;
import data_access_layer.data.EmployeeCollection;
import data_access_layer.data.TaskCollection;
import data_access_layer.interfaces.DAOTask;

public class DAOTaskImpl implements DAOTask {

	@Override
	public void create(Task task) {
		
		for(int i = 0;i<TaskCollection.getTasklist().size();i++) {
			
			if(TaskCollection.getTasklist().contains(task)==false) {
				TaskCollection.getTasklist().add(task);
			}
			else {
				System.out.println("Task Exist");
			}
		}
	}

	@Override
	public void update(Task task) {
		
		
		
	}

	@Override
	public void delete(Task task) {
		
		Integer id;
		
		id = task.getIdTask();
		
		TaskCollection.getTasklist().remove(taskById(id));
		
	}

	@Override
	public Task taskById(Integer id) {

		for(int i= 0;i<TaskCollection.getTasklist().size();i++) {
			if(TaskCollection.getTasklist().get(i).getIdTask()==id);
			{return TaskCollection.getTasklist().get(i);}
		}
		
		return null;
	}

	@Override
	public Integer size() {

		Integer size = TaskCollection.getTasklist().size();
		
		return size;
	}

	@Override
	public List<Task> toList() {
		
		List<Task> list = TaskCollection.getTasklist();
		
		return list;
	}

}
