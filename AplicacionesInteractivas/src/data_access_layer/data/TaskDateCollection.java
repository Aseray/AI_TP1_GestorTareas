package data_access_layer.data;

import java.util.ArrayList;
import java.util.List;

import business_layer.business_objects.TaskDate;

public class TaskDateCollection {
	
	private static List<TaskDate> taskdatelist = new ArrayList<>();

	public static List<TaskDate> getTaskdatelist() {
		return taskdatelist;
	}
}
