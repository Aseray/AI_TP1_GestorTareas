package business_layer.business_objects;

public class Employee {
	
	private Integer id;
	private String name;
	private String lastName;
	private Integer dni;
	private Integer idteam;
	
	public Employee(Integer id, String name, String lastName, Integer dni, Integer idteam) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.idteam = idteam;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getIdteam() {
		return idteam;
	}

	public void setIdteam(Integer idteam) {
		this.idteam = idteam;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", idteam="
				+ idteam + "]";
	}
	
	
	
	
	
	

}
