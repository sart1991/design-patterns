package com.designpatterns.learn.web.controller;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.DesignPatternDomain;
import com.designpatterns.learn.services.DesignPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/factory")
public class FactoryController {

    @Autowired
    private final DesignPatternService designPatternService;

    public FactoryController(DesignPatternService designPatternService) {
        this.designPatternService = designPatternService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<DesignPatternDomain> getFactory(@PathVariable("code") String code) {
        Optional<DesignPattern> dp = designPatternService.requestFactory(code);
        return ResponseEntity.of(DesignPatternDomain.of(dp));
    }

}
