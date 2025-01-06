package com.example.football_betting_system.MatchService.Service;


import com.example.football_betting_system.MatchService.Model.Match;
import com.example.football_betting_system.MatchService.Repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    // Добавление нового матча
    public Match addMatch(Match match) {
        return matchRepository.save(match);
    }

    // Получение списка всех матчей
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    // Получение матча по ID
    public Optional<Match> getMatchById(Long id) {
        return matchRepository.findById(id);
    }
}

