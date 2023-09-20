package com.ktcdev.hexagonalcqrsjava.league.domain.model;

import com.ktcdev.hexagonalcqrsjava.league.domain.exception.LeagueException;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Embeddable
@NoArgsConstructor
public class LeagueCountry {

    private String value;

    public LeagueCountry(String value) {
        validate(value);
        this.value = value;
    }

    public String value() {
        return value;
    }

    private void validate(String value) {
        if (Objects.isNull(value)) throw new LeagueException("The field country cannot be null");
        if (value.length() > 50) throw new LeagueException("The field country is bigger that maximun size");
    }

}
