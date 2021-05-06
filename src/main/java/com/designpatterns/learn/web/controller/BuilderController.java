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
@RequestMapping("/builder")
public class BuilderController {

    @Autowired
    private DesignPatternService designPatternService;

    @GetMapping
    public ResponseEntity<DesignPatternDomain> getBuilder() {
        Optional<DesignPattern> dp = designPatternService.requestBuilder();
        return ResponseEntity.of(DesignPatternDomain.of(dp));
    }

}
