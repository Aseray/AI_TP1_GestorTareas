package business_layer.business_objects;

import java.time.LocalDate;

import data_access_layer.data_access_objects.DAOTaskDateImpl;
import data_access_layer.interfaces.DAOTaskDate;

public class TaskDate {
	
	private LocalDate creationDate;
	private LocalDate finishDate = null;
	private LocalDate dueDate;
	private LocalDate lastUpdateDate;
	private Integer idTask = autoIncrementID();
	
	public TaskDate(LocalDate creationDate, LocalDate dueDate, LocalDate lastUpdateDate) {
		super();
		this.creationDate = creationDate;
		this.dueDate = dueDate;
		this.lastUpdateDate = lastUpdateDate;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(LocalDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}
	
	private Integer autoIncrementID() {
		
		DAOTaskDate data = new DAOTaskDateImpl();
		
		Integer num = data.toList().get(data.size()).getIdTask();
		
		return num + 1;
		
		
	}

	@Override
	public String toString() {
		return "TaskDate [creationDate=" + creationDate + ", finishDate=" + finishDate + ", dueDate=" + dueDate
				+ ", lastUpdateDate=" + lastUpdateDate + ", idTask=" + idTask + "]";
	}
	
	
	
	
	
	

}
