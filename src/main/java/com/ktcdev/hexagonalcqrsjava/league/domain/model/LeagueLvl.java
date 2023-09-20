package com.ktcdev.hexagonalcqrsjava.league.domain.model;

import com.ktcdev.hexagonalcqrsjava.league.domain.exception.LeagueException;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Embeddable
@NoArgsConstructor
public class LeagueLvl {

    private Float value;

    public LeagueLvl(Float value) {
        validate(value);
        this.value = value;
    }

    public Float value() {
        return value;
    }

    private void validate(Float value) {
        if (Objects.isNull(value)) throw new LeagueException("The field Lvl cannot be null");
    }

}
