package selfstudy;

import java.util.*;
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
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon", 16000),
                new Fruit("watermelon", 19000),
                new Fruit("strawberry", 10000),
                new Fruit("kiwi", 13000),
                new Fruit("banana", 16000)
        );
        System.out.println(
                fruitList
                        .stream()
                       // .mapToInt(f -> f.getPrice())
                        .mapToInt(Fruit::getPrice)
                        .average()
                        .getAsDouble()
        );


//        fruitList.stream().forEach(f -> {
//            String name = f.getName();
//            int price = f.getPrice();
//            System.out.println(name + " : " + price);
//        });

    }
}
