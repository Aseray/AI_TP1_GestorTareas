package business_layer.data_transfer_objects;

public class DTOEmployee {
	
	private Integer idEmployee;
	private String name;
	private String lastName;
	private Integer idTeam;
	
	public DTOEmployee(Integer idEmployee, String name, String lastName, Integer idTeam) {
		super();
		this.idEmployee = idEmployee;
		this.name = name;
		this.lastName = lastName;
		this.idTeam = idTeam;
	}

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
	}
	
	
	
	
	
	
	
	
	
	

}
