package com.ktcdev.hexagonalcqrsjava.league.infrastructure.repository;

import com.ktcdev.hexagonalcqrsjava.league.domain.model.League;
import com.ktcdev.hexagonalcqrsjava.league.domain.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class LeagueH2Repository implements LeagueRepository {

    private final LeagueJpaRepository repository;

    @Autowired
    public LeagueH2Repository(LeagueJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<League> findById(UUID id) {
        return repository.findById(id);
    }

}
