package business_layer.business_objects;

import data_access_layer.data_access_objects.DAOLocationImpl;
import data_access_layer.interfaces.DAOLocation;

public class Location {
	
	private String longitude;
	private String latitude;
	private Integer idTask = autoIncrementID();
	
	public Location(String longitude, String latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}
	
	private Integer autoIncrementID() {
		
		DAOLocation data = new DAOLocationImpl();
		
		Integer num = data.toList().get(data.toList().size()).getIdTask();
		
		return num + 1;
	}

	@Override
	public String toString() {
		return "Location [longitude=" + longitude + ", latitude=" + latitude + ", idTask=" + idTask + "]";
	}	
	
	
	
	
}
