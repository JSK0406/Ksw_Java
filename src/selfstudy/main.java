package selfstudy;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Fruit {
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class main {
    private static int result;
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon", 16000),
                new Fruit("watermelon", 19000),
                new Fruit("strawberry", 10000),
                new Fruit("kiwi", 13000),
                new Fruit("banana", 16000)
        );

        Stream<Fruit> st = fruitList.stream();
        fruitList.stream().sorted((f1, f2) -> f1.getPrice() - f2.getPrice()).forEach(f -> System.out.println(f.getName() + " "));
//        fruitList.stream().sorted(Comparator.reverseOrder()).forEach(f -> System.out.println(f.getName() + " "));
    }
}