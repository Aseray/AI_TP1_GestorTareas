package data_access_layer.interfaces;

import java.util.List;

import business_layer.business_objects.Location;

public interface DAOLocation {
	
	public void create(Location loc);
	public void update(Location loc);
	public void delete(Location loc);
	public List<Location> toList();
	public Location locationById(Integer id);
	public Integer size();

}
