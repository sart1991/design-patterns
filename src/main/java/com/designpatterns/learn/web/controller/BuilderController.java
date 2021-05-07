package com.designpatterns.learn.web.controller;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.DesignPatternDomain;
import com.designpatterns.learn.services.CreationalDesignPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @Autowired
    private final CreationalDesignPatternService creationalDesignPatternService;

    public BuilderController(CreationalDesignPatternService creationalDesignPatternService) {
        this.creationalDesignPatternService = creationalDesignPatternService;
    }

    @GetMapping
    public ResponseEntity<DesignPatternDomain> getBuilder() {
        Optional<DesignPattern> dp = creationalDesignPatternService.requestBuilder();
        return ResponseEntity.of(DesignPatternDomain.of(dp));
    }

}
