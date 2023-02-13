package learning.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

class Circle implements Comparable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return String.format("원의 반지름은 %s 입니다.", radius);
    }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle) o;
        return (int) (getArea() - c.getArea());
    }
}


public class Day21 {
    public static void main(String[] args){
        Circle[] circles = { new Circle(5.0), new Circle(2.5), new Circle(10.0)};
        Arrays.sort(circles);
        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
