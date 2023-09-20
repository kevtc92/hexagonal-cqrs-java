package com.ktcdev.hexagonalcqrsjava.league.infrastructure.repository;

import com.ktcdev.hexagonalcqrsjava.league.domain.model.League;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LeagueJpaRepository extends JpaRepository<League, UUID> {
}
