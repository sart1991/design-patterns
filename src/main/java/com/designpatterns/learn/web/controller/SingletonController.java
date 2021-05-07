package com.designpatterns.learn.web.controller;

import com.designpatterns.learn.domains.DesignPatternDomain;
import com.designpatterns.learn.domains.creational.singleton.Singleton;
import com.designpatterns.learn.services.CreationalDesignPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/singleton")
public class SingletonController {

    @Autowired
    private final CreationalDesignPatternService creationalDesignPatternService;

    public SingletonController(CreationalDesignPatternService creationalDesignPatternService) {
        this.creationalDesignPatternService = creationalDesignPatternService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<DesignPatternDomain> getSingleton(@PathVariable("code") String code) {
        Optional<Singleton> dp = creationalDesignPatternService.requestSingleton(code);
        return ResponseEntity.of(DesignPatternDomain.of(dp));
    }

}
