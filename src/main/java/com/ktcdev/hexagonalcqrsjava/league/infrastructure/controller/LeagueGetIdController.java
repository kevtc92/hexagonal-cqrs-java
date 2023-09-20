package com.ktcdev.hexagonalcqrsjava.league.infrastructure.controller;

import com.ktcdev.hexagonalcqrsjava.league.application.findbyid.FindByIdLeague;
import com.ktcdev.hexagonalcqrsjava.league.application.findbyid.FindByIdLeagueQuery;
import io.vavr.control.Try;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin
@RequestMapping("league")
public class LeagueGetIdController {

    private final FindByIdLeague findByIdLeague;

    @Autowired
    public LeagueGetIdController(FindByIdLeague findByIdLeague) {
        this.findByIdLeague = findByIdLeague;
    }

    @GetMapping("{id}")
    public HttpEntity<Object> getById(@PathVariable String id) {
        FindByIdLeagueQuery query = new FindByIdLeagueQuery(id);
        Object response = Try.of(() -> findByIdLeague.findById(query)).getOrElseThrow(ex ->
            new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage())
        );
        return ResponseEntity.ok(response);
    }

}
