package services;

import java.util.List;

import dto.TeamDTO;

public interface TeamService {
	
    void addTeam(TeamDTO teamDTO);
    List<TeamDTO> getAllTeams();

}
