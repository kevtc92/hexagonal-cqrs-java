package com.ktcdev.hexagonalcqrsjava.league.domain.model;

import com.ktcdev.hexagonalcqrsjava.league.domain.exception.LeagueException;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Embeddable
@NoArgsConstructor
public class LeagueName {

    private String value;

    public LeagueName(String value) {
        validate(value);
        this.value = value;
    }

    public String value() {
        return value;
    }

    private void validate(String value) {
        if (Objects.isNull(value)) throw new LeagueException("The field name cannot be null");
        if (value.length() > 100) throw new LeagueException("The field name is bigger that maximun size");
    }

}
