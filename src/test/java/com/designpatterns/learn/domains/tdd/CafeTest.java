package com.designpatterns.learn.domains.tdd;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class CafeTest {

    private static final int ESPRESSO_BEANS_WEIGHT = 7;
    private static final int LATTE_MILK_WEIGHT = 277;

    private Cafe cafe;

    @BeforeEach
    public void setup() {
        cafe = new Cafe();
        System.out.println("before");
    }

    @AfterEach
    public void teardown() {
        System.out.println("after");
    }

    @AfterAll
    static void end() {
        System.out.println("end");
    }

    @Test
    public void canBrewEspresso() {
        // given
        cafe.restockBeans(ESPRESSO_BEANS_WEIGHT);

        // when
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        // then
        assertEquals(7, coffee.getBeans());
        assertEquals(0, coffee.getMilk());
        assertEquals(CoffeeType.Espresso, coffee.getType());
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        // given
        cafe.restockBeans(ESPRESSO_BEANS_WEIGHT);

        // when
        cafe.brew(CoffeeType.Espresso);

        // then
        assertThat(cafe, hasProperty("beansInStock", is(0)));
    }

    @Test
    public void canBrewLatte() {
        // given
        cafe.restockBeans(ESPRESSO_BEANS_WEIGHT);
        cafe.restockMilk(LATTE_MILK_WEIGHT);

        // when
        Coffee coffee = cafe.brew(CoffeeType.Latte);

        // then
        assertEquals(CoffeeType.Latte, coffee.getType());
    }

    @Test
    public void mustRestockMilk() {

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            // when
            cafe.restockMilk(0);
        });
    }

    @Test
    public void mustRestockBeans() {

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            // when
            cafe.restockBeans(0);
        });
    }

    @Test
    public void lattesRequireMilk() {

        // given
        cafe.restockBeans(ESPRESSO_BEANS_WEIGHT);

        // then
        assertThrows(IllegalStateException.class, () -> {
            // when
            cafe.brew(CoffeeType.Latte);
        }, "incorrectly brewed Latte");
    }

    @Test
    public void shouldHasSevenAndTenBeans() {
        cafe.restockBeans(100);
        cafe.restockMilk(2000);
        List<Coffee> coffees = Arrays.asList(cafe.brew(CoffeeType.Espresso), cafe.brew(CoffeeType.FilterCoffee));
        assertThat(coffees, containsInAnyOrder(
                hasProperty("beans", is(10)),
                hasProperty("beans", is(7))
        ));
    }

}
