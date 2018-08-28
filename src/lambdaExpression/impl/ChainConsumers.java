package lambdaExpression.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        List<String> results = new ArrayList<>();

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = results::add;

        strings.forEach(c1.andThen(c2));

        System.out.println("Size of results = " + results.size());

    }
}
