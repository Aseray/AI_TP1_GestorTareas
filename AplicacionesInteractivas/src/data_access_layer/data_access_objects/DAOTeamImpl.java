package data_access_layer.data_access_objects;

import java.util.List;

import business_layer.business_objects.Team;
import data_access_layer.data.EmployeeCollection;
import data_access_layer.data.TeamCollection;
import data_access_layer.interfaces.DAOTeam;

public class DAOTeamImpl implements DAOTeam{

	@Override
	public void create(Team team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Team team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Team team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Team teamById(Integer id) {
		
		for(int i= 0;i<TeamCollection.getTeamlist().size();i++) {
			if(TeamCollection.getTeamlist().get(i).getIdTeam()==id)
			{return TeamCollection.getTeamlist().get(i);}
			
		}
		return null;
	}

	@Override
	public Integer size() {
		
		Integer size = TeamCollection.getTeamlist().size();
		
		return size;
	}

	@Override
	public List<Team> toList() {
		
		List<Team> list = TeamCollection.getTeamlist();
		
		return list;
	}

}
