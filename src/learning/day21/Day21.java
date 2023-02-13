package learning.day21;

import java.util.Arrays;
import java.util.Comparator;

//class Circle implements Comparable{
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    public double getRadius() {
//        return radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public String toString() {
//        return String.format("원의 반지름은 %s 입니다.", radius);
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        Circle c = (Circle) o;
//        return (int) (getArea() - c.getArea());
//    }
//}


public class Day21 {
    public static void main(String[] args) {
//        Circle[] circles = { new Circle(5.0), new Circle(2.5), new Circle(10.0)};
//        Arrays.sort(circles);
//        for (Circle c : circles) {
//            System.out.println(c);
//        }
//    }
        String[] strings = {"Hi", "Hello friend", "Aello friend professor"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        for(String s : strings) {
            System.out.println(s);
        }

    }
}
