package com.ktcdev.hexagonalcqrsjava.league.domain.model;

import com.ktcdev.hexagonalcqrsjava.league.domain.exception.LeagueException;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Embeddable
@NoArgsConstructor
public class LeagueCategory {

    private Integer value;

    public LeagueCategory(Integer value) {
        validate(value);
        this.value = value;
    }

    public Integer value() {
        return value;
    }

    private void validate(Integer value) {
        if (Objects.isNull(value)) throw new LeagueException("The field category cannot be null");
    }

}
