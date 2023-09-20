package com.ktcdev.hexagonalcqrsjava.league.application.findbyid;

import com.ktcdev.hexagonalcqrsjava.league.domain.model.*;
import com.ktcdev.hexagonalcqrsjava.share.domain.Converter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FindByIdLeagueConverter implements Converter<League, FindByIdLeagueResponse> {

    @Override
    public League fromDto(FindByIdLeagueResponse dto) {
        return League.builder()
                .idLeague(UUID.fromString(dto.getId()))
                .name(new LeagueName(dto.getName()))
                .country(new LeagueCountry(dto.getCountry()))
                .category(new LeagueCategory(dto.getCategory()))
                .lvl(new LeagueLvl(dto.getLvl()))
                .build();
    }

    @Override
    public FindByIdLeagueResponse fromEntity(League entity) {
        return FindByIdLeagueResponse.builder()
                .id(entity.getIdLeague().toString())
                .name(entity.getName().value())
                .country(entity.getCountry().value())
                .category(entity.getCategory().value())
                .lvl(entity.getLvl().value())
                .build();
    }

}
