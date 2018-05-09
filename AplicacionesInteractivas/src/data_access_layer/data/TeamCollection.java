package data_access_layer.data;

import java.util.ArrayList;
import java.util.List;

import business_layer.business_objects.Team;

public class TeamCollection {
	
	private static List<Team> teamlist = new ArrayList<>();

	public static List<Team> getTeamlist() {
		return teamlist;
	}

}
