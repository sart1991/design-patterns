package com.designpatterns.learn.web.controller;

import com.designpatterns.learn.domains.DesignPattern;
import com.designpatterns.learn.domains.DesignPatternDomain;
import com.designpatterns.learn.domains.DesignPatternType;
import com.designpatterns.learn.services.DesignPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleton")
public class SingletonController {

    @Autowired
    private final DesignPatternService designPatternService;

    public SingletonController(DesignPatternService designPatternService) {
        this.designPatternService = designPatternService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<DesignPatternDomain> getSingleton(@PathVariable("code") String code) {
        try {
            DesignPattern dp = designPatternService.requestDesignPattern(DesignPatternType.SINGLETON, code);
            return ResponseEntity.ok(new DesignPatternDomain(dp));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
