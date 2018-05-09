package business_layer.data_transfer_objects;

public class DTOTeam {
	
	private Integer idTeam;
	private Integer TeamLeader;
	
	public DTOTeam(Integer idTeam, Integer teamLeader) {
		super();
		this.idTeam = idTeam;
		TeamLeader = teamLeader;
	}

	public Integer getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
	}

	public Integer getTeamLeader() {
		return TeamLeader;
	}

	public void setTeamLeader(Integer teamLeader) {
		TeamLeader = teamLeader;
	}
	
	
	
	

}
