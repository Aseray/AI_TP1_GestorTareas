package business_layer.controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import business_layer.business_objects.Task;
import business_layer.business_objects.TaskDate;
import data_access_layer.data_access_objects.DAOTaskDateImpl;
import data_access_layer.interfaces.DAOTaskDate;

public class Reports {
	
	public void printReportTaskNotComplete() {
		
		DateValidator datev = new DateValidator();
		DAOTaskDate daod = new DAOTaskDateImpl();
		List<Task> listtask = datev.dueTaskNotComplete();
		List<TaskDate> listdate = daod.toList();
		
		try {
			
			FileWriter report = new FileWriter("C:\\Users\\f\\Desktop\\reportes\\reporteTareasNoCompletadas.txt");
			
			LocalDate date = LocalDate.now();
			
			report.write("Reporte del dia: "+date);
			report.write("\r\n");
			report.write("IDTarea Progreso FechaVencimiento");
			
			for(int j = 0;j<listtask.size();j++) {
				
				report.write("\r\n");
				
				report.write(listtask.get(j).getIdTask()+" "+listtask.get(j).getProgress()+" "+listdate.get(j).getDueDate());
				
			}
			
			
			report.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void printReportTaskCompleteLate() {
		
		DateValidator datev = new DateValidator();
		DAOTaskDate daod = new DAOTaskDateImpl();
		List<Task> listtask = datev.taskCompleteLate();
		List<TaskDate> listdate = daod.toList();
		
		try {
			
			FileWriter report = new FileWriter("C:\\Users\\f\\Desktop\\reportes\\reporteTareasNoCompletadas.txt");
			
			LocalDate date = LocalDate.now();
			
			report.write("Reporte del dia: "+date);
			report.write("\r\n");
			report.write("IDTarea Progreso FechaVencimiento");
			
			for(int j = 0;j<listtask.size();j++) {
				
				report.write("\r\n");
				
				report.write(listtask.get(j).getIdTask()+" "+listdate.get(j).getDueDate());
				
			}
			
			
			report.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void printReportTasknotmonitored() {
		
		DateValidator datev = new DateValidator();
		DAOTaskDate daod = new DAOTaskDateImpl();
		List<Task> listtask = datev.taskNotMonitoredThisWeek();
		List<TaskDate> listdate = daod.toList();
		
		try {
			
			FileWriter report = new FileWriter("C:\\Users\\f\\Desktop\\reportes\\reporteTareasNoCompletadas.txt");
			
			LocalDate date = LocalDate.now();
			
			report.write("Reporte del dia: "+date);
			report.write("\r\n");
			report.write("IDTarea Progreso FechaVencimiento FechaUltimaActualizacion");
			
			for(int j = 0;j<listtask.size();j++) {
				
				report.write("\r\n");
				
				report.write(listtask.get(j).getIdTask()+" "+listtask.get(j).getProgress()+" "+listdate.get(j).getDueDate()+" "+listdate.get(j).getLastUpdateDate());
				
			}
			
			
			report.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
