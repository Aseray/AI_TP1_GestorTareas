package business_layer.controllers;

import java.time.LocalDate;

import business_layer.business_objects.Employee;
import business_layer.business_objects.Location;
import business_layer.business_objects.Task;
import business_layer.business_objects.TaskDate;
import business_layer.business_objects.Team;
import business_layer.data_transfer_objects.DTOTask;
import business_layer.data_transfer_objects.DTOTaskUpdate;
import data_access_layer.data_access_objects.DAOEmployeeImpl;
import data_access_layer.data_access_objects.DAOTaskDateImpl;
import data_access_layer.data_access_objects.DAOTaskImpl;
import data_access_layer.data_access_objects.DAOTeamImpl;
import data_access_layer.interfaces.DAOEmployee;
import data_access_layer.interfaces.DAOTask;
import data_access_layer.interfaces.DAOTaskDate;
import data_access_layer.interfaces.DAOTeam;

public class Assembler {
	
	public void createTask(DTOTask dto) {
		
		DAOTaskDate datatd = new DAOTaskDateImpl();
		DAOTask datatask = new DAOTaskImpl();
		DAOTeam datateam = new DAOTeamImpl();
		DAOEmployee dataemp = new DAOEmployeeImpl(); 
		
		Team team = datateam.teamById(dto.getIdTeam());
		Employee emp = dataemp.employeeById(dto.getIdEmployee());
		LocalDate date = LocalDate.now();
		Location loc = new Location(dto.getLongitud(),dto.getLatitude());
		
		TaskDate taskdate = new TaskDate(date,dto.getDueDate(),date);
		Task task = new Task(team,dto.getProduct(),loc,emp);
		
		datatd.create(taskdate);
		datatask.create(task);		
	}
	
	public void updateTask(DTOTaskUpdate dto) {
		
	}

}
