package com.ktcdev.hexagonalcqrsjava.league.application.findbyid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class FindByIdLeagueResponse {
    private String id;
    private String name;
    private String country;
    private int category;
    private float lvl;
}
