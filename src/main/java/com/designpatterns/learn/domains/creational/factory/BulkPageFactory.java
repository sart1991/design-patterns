package com.designpatterns.learn.domains.creational.factory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BulkPageFactory {

    public List<Page> createPages(int amount) {
        return IntStream.range(0, amount).mapToObj(n -> new Page(n + "")).collect(Collectors.toList());
    }

}
