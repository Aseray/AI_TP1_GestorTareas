package business_layer.controllers;

import java.io.FileWriter;
import java.io.IOException;

import data_access_layer.data_access_objects.DAOLocationImpl;
import data_access_layer.data_access_objects.DAOTaskDateImpl;
import data_access_layer.data_access_objects.DAOTaskImpl;
import data_access_layer.interfaces.DAOLocation;
import data_access_layer.interfaces.DAOTask;
import data_access_layer.interfaces.DAOTaskDate;

public class Synchronize {{
	
	DAOTask dt = new DAOTaskImpl();
	DAOTaskDate dtd = new DAOTaskDateImpl();
	DAOLocation dl = new DAOLocationImpl();
	
	try {
		FileWriter sync = new FileWriter("C:\\Users\\f\\Desktop\\tareas.txt");
		
		for(int i = 0;i<dt.toList().size();i++) {
			
			sync.write(dt.toList().get(i).toString());
			sync.write("/r/n");
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileWriter sync = new FileWriter("C:\\Users\\f\\Desktop\\fechasTareas.txt");
		
		for(int j = 0;j<dtd.toList().size();j++) {
			
			sync.write(dtd.toList().get(j).toString());
			sync.write("/r/n");
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileWriter sync = new FileWriter("C:\\Users\\f\\Desktop\\localizacionesTareas.txt");
		
		for(int k = 0;k<dl.toList().size();k++) {
			
			sync.write(dl.toList().get(k).toString());
			sync.write("/r/n");
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

}}
