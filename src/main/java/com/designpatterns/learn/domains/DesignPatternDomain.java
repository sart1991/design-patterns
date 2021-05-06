package com.designpatterns.learn.domains;

import java.util.Optional;

public class DesignPatternDomain {

    private String description;

    public DesignPatternDomain(DesignPattern dp) {
        description = dp.describe();
    }

    public static <T extends DesignPattern> Optional<DesignPatternDomain> of(Optional<T> opt) {
        return opt.map(DesignPatternDomain::new);
    }

    public String getDescription() {
        return description;
    }

}
