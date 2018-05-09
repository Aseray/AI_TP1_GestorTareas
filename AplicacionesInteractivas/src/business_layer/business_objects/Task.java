package business_layer.business_objects;

import data_access_layer.data_access_objects.DAOTaskImpl;
import data_access_layer.interfaces.DAOTask;

public class Task {
	
	private Integer idTask = autoIncrementID();  
	private Team team;		
	private String product; 
	private Location location; 
	private Boolean status = false;				
	private Employee assingnedWorker;
	private Integer progress = 0;
	private Boolean sync = false;
	
	public Task(Team team, String product, Location location, Employee assingnedWorker) {
		super();
		this.team = team;
		this.product = product;
		this.location = location;
		this.assingnedWorker = assingnedWorker;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Employee getAssingnedWorker() {
		return assingnedWorker;
	}

	public void setAssingnedWorker(Employee assingnedWorker) {
		this.assingnedWorker = assingnedWorker;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Boolean getSync() {
		return sync;
	}

	public void setSync(Boolean sync) {
		this.sync = sync;
	}
	
	private Integer autoIncrementID() {
		
		DAOTask data = new DAOTaskImpl();
		
		Integer num = data.toList().get(data.toList().size()).getIdTask();
		
		return num + 1;
	}

	@Override
	public String toString() {
		return "Task [idTask=" + idTask + ", team=" + team + ", product=" + product + ", location=" + location
				+ ", status=" + status + ", assingnedWorker=" + assingnedWorker + ", progress=" + progress + ", sync="
				+ sync + "]";
	}
	
	
	
	
	
	

}
