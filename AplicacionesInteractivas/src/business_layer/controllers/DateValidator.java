package business_layer.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business_layer.business_objects.Task;
import business_layer.business_objects.TaskDate;
import data_access_layer.data_access_objects.DAOTaskDateImpl;
import data_access_layer.data_access_objects.DAOTaskImpl;
import data_access_layer.interfaces.DAOTask;
import data_access_layer.interfaces.DAOTaskDate;

public class DateValidator {
	
	
	public List<Task> dueTaskNotComplete(){
		
		
		List<Task> tasknotcomplete = new ArrayList<>();
		
		DAOTaskDate taskdate = new DAOTaskDateImpl();
		DAOTask task = new DAOTaskImpl();
		
		List<Task> listtask = task.toList();
		List<TaskDate> listdate = taskdate.toList();
		
		LocalDate datenow = LocalDate.now();
		
		for(int i = 0;i<listdate.size();i++) {
			
			if(listdate.get(i).getDueDate().isBefore(datenow)==true&&listtask.get(i).getStatus()==false) {
				
				tasknotcomplete.add(listtask.get(i));
				
			}
		}
		
		return tasknotcomplete;
	}
	
	public List<Task> taskCompleteLate(){
		
		List<Task> taskcompletelate = new ArrayList<>();
		
		DAOTaskDate taskdate = new DAOTaskDateImpl();
		DAOTask task = new DAOTaskImpl();
		
		List<Task> listtask = task.toList();
		List<TaskDate> listdate = taskdate.toList();
		
		LocalDate datenow = LocalDate.now();
		
		for(int i = 0;i<listdate.size();i++) {
			
			if(listdate.get(i).getDueDate().isBefore(datenow)==true&&listtask.get(i).getStatus()==true) {
				
				taskcompletelate.add(listtask.get(i));
				
			}
			
		}
		
		return taskcompletelate;
	}
	
	public List<Task> taskNotMonitoredThisWeek(){
		
		List<Task> tasknotmonitored = new ArrayList<>();
		
		DAOTaskDate taskdate = new DAOTaskDateImpl();
		DAOTask task = new DAOTaskImpl();
		
		List<Task> listtask = task.toList();
		List<TaskDate> listdate = taskdate.toList();
		
		LocalDate datenow = LocalDate.now();
		LocalDate week = datenow.minusWeeks(1);
		
		for(int i = 0;i<listdate.size();i++) {
			
			if(listdate.get(i).getLastUpdateDate().isBefore(week)==true&&listtask.get(i).getStatus()==false) {
				
				tasknotmonitored.add(listtask.get(i));
				
			}
			
		}
		
		return tasknotmonitored;
	}
	
	

}
