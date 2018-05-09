package business_layer.data_transfer_objects;

import java.time.LocalDate;

public class DTOTask {
	
	private Integer idTeam;
	private String product;
	private String longitud;
	private String latitude;
	private Integer idEmployee;
	private LocalDate dueDate;
	
	public DTOTask(Integer idTeam, String product, String longitud, String latitude, Integer idEmployee,
			LocalDate dueDate) {
		super();
		this.idTeam = idTeam;
		this.product = product;
		this.longitud = longitud;
		this.latitude = latitude;
		this.idEmployee = idEmployee;
		this.dueDate = dueDate;
	}
	
	
	public Integer getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Integer getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	

}
