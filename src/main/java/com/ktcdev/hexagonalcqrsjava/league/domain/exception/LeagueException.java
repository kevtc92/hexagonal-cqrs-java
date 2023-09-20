package com.ktcdev.hexagonalcqrsjava.league.domain.exception;

public class LeagueException extends RuntimeException {

    public LeagueException(String message) {
        super("League Exception" + message);
    }
}
