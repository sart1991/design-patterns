package com.designpatterns.learn.web.controller;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.DesignPatternDomain;
import com.designpatterns.learn.services.DesignPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/prototype")
public class PrototypeController {

    @Autowired
    private final DesignPatternService designPatternService;

    public PrototypeController(DesignPatternService designPatternService) {
        this.designPatternService = designPatternService;
    }

    @GetMapping
    public ResponseEntity<DesignPatternDomain> getPrototype() {
        Optional<DesignPattern> dp = designPatternService.requestPrototype();
        return ResponseEntity.of(DesignPatternDomain.of(dp));
    }

}
