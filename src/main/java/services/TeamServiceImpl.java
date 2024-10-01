package services;

import java.util.ArrayList;
import java.util.List;

import dao.TeamDAO;
import dto.TeamDTO;
import models.Team;

public class TeamServiceImpl implements TeamService{
    private TeamDAO teamDAO;

    public TeamServiceImpl(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
    
    @Override
    public void addTeam(TeamDTO teamDTO) {
        Team team = new Team();
        team.setName(teamDTO.getName());
        
        teamDAO.addTeam(team);
    }
    
    @Override
    public List<TeamDTO> getAllTeams() {
        List<Team> teams = teamDAO.getAllTeams();
        List<TeamDTO> teamDTOs = new ArrayList<>();
        for (Team team : teams) {
            teamDTOs.add(new TeamDTO(team.getId(), team.getName()));
        }
        return teamDTOs;
    }
}
