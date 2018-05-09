package data_access_layer.data;

import java.util.ArrayList;
import java.util.List;

import business_layer.business_objects.Location;

public class LocationCollection {
	
	private static List<Location> locationlist = new ArrayList<>();

	public static List<Location> getLocationlist() {
		return locationlist;
	}

}
