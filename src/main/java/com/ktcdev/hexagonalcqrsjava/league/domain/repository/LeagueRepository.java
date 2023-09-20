package com.ktcdev.hexagonalcqrsjava.league.domain.repository;

import com.ktcdev.hexagonalcqrsjava.league.domain.model.League;

import java.util.Optional;
import java.util.UUID;

public interface LeagueRepository {
    Optional<League> findById(UUID id);
}
