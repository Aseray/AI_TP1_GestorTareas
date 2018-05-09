package business_layer.data_transfer_objects;

public class DTOTaskUpdate {
	
	private Integer idTask;
	private Integer progress;
	private Boolean status;
	
	public DTOTaskUpdate(Integer idTask, Integer progress, Boolean status) {
		super();
		this.idTask = idTask;
		this.progress = progress;
		this.status = status;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	

}
