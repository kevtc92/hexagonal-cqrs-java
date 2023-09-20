package com.ktcdev.hexagonalcqrsjava.league.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "FT_LEAGUE")
public class League {

    @Id
    @Column(name = "ID_LEAGUE")
    private UUID idLeague;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "NAME"))
    private LeagueName name;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "COUNTRY"))
    private LeagueCountry country;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "CATEGORY"))
    private LeagueCategory category;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "LVL"))
    private LeagueLvl lvl;

}
