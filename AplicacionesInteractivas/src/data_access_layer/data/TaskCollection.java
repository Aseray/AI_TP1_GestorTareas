package data_access_layer.data;

import java.util.ArrayList;
import java.util.List;

import business_layer.business_objects.Task;

public class TaskCollection {
	
	private static List<Task> tasklist = new ArrayList<>();

	public static List<Task> getTasklist() {
		return tasklist;
	}
}
