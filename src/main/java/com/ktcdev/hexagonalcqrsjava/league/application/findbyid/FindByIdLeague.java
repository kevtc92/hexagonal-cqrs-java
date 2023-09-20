package com.ktcdev.hexagonalcqrsjava.league.application.findbyid;

import com.ktcdev.hexagonalcqrsjava.league.domain.exception.LeagueException;
import com.ktcdev.hexagonalcqrsjava.league.domain.model.League;
import com.ktcdev.hexagonalcqrsjava.league.domain.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FindByIdLeague {

    private final LeagueRepository leagueRepository;
    private final FindByIdLeagueConverter converter;

    @Autowired
    public FindByIdLeague(LeagueRepository leagueRepository, FindByIdLeagueConverter converter) {
        this.leagueRepository = leagueRepository;
        this.converter = converter;
    }

    public FindByIdLeagueResponse findById(FindByIdLeagueQuery query) {
        League league = leagueRepository.findById(UUID.fromString(query.getId()))
                .orElseThrow(() -> new LeagueException("Could find League with id " + query.getId()));
        return converter.fromEntity(league);
    }

}
