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
@RequestMapping("/prototype")
public class PrototypeController {

    @Autowired
    private final CreationalDesignPatternService creationalDesignPatternService;

    public PrototypeController(CreationalDesignPatternService creationalDesignPatternService) {
        this.creationalDesignPatternService = creationalDesignPatternService;
    }

    @GetMapping
    public ResponseEntity<DesignPatternDomain> getPrototype() {
        Optional<DesignPattern> dp = creationalDesignPatternService.requestPrototype();
        return ResponseEntity.of(DesignPatternDomain.of(dp));
    }

}
