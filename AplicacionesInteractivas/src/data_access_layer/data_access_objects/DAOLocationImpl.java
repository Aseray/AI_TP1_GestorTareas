package data_access_layer.data_access_objects;

import java.util.List;

import business_layer.business_objects.Location;
import data_access_layer.data.LocationCollection;
import data_access_layer.interfaces.DAOLocation;

public class DAOLocationImpl implements DAOLocation {

	@Override
	public void create(Location loc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Location loc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Location loc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location locationById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer size() {
		
		Integer size = LocationCollection.getLocationlist().size();
		
		return size;
	}

	@Override
	public List<Location> toList() {
		
		List<Location> list = LocationCollection.getLocationlist();
		
		return list;
	}

}
