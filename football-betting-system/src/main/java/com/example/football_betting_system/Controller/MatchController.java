package com.example.football_betting_system.MatchService.Controller;


import com.example.football_betting_system.MatchService.Model.Match;
import com.example.football_betting_system.MatchService.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    // Получение всех матчей
    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    // Получение матча по ID
    @GetMapping("/{id}")
    public Optional<Match> getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    // Добавление нового матча
    @PostMapping
    public Match addMatch(@RequestBody Match match) {
        return matchService.addMatch(match);
    }
}

