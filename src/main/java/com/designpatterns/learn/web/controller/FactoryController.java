package com.designpatterns.learn.web.controller;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.DesignPatternDomain;
import com.designpatterns.learn.services.CreationalDesignPatternService;
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
    private final CreationalDesignPatternService creationalDesignPatternService;

    public FactoryController(CreationalDesignPatternService creationalDesignPatternService) {
        this.creationalDesignPatternService = creationalDesignPatternService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<DesignPatternDomain> getFactory(@PathVariable("code") String code) {
        Optional<DesignPattern> dp = creationalDesignPatternService.requestFactory(code);
        return ResponseEntity.of(DesignPatternDomain.of(dp));
    }

}
