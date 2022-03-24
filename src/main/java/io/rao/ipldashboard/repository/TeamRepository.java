package io.rao.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.rao.ipldashboard.Model.Team;

public interface TeamRepository extends CrudRepository<Team, Long > {

    Team findByTeamName(String teamName);
    
}
