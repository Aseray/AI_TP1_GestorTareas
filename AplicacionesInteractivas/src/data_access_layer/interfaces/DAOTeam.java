package data_access_layer.interfaces;

import java.util.List;

import business_layer.business_objects.Team;

public interface DAOTeam {
	
	public void create(Team team);
	public void update(Team team);
	public void delete(Team team);
	public List<Team> toList();
	public Team teamById(Integer id);
	public Integer size();

}
