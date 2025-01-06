package com.example.football_betting_system.MatchService.Repository;

import com.example.football_betting_system.MatchService.Model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

}

