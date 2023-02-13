package homework.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Shape {
    private String type;
    private String color;
    private Double area;

    public Shape(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }
}

class ShapeTest {
    static List<Shape> tmplst1 = new ArrayList<>();
    static List<Shape> findShapesByType(List<Shape> shapes, String type) {
        for (Shape i : shapes) {
            if (i.getType().equals(type)) {
                tmplst1.add(i);
            }
        }
        return tmplst1;
    }
//    static List<Shape> findShapeByColorNArea(List<Shape> shapes, String color, double area) {
//        return 0;
//    }
}
public class Day21HomeWork {
    public static void main(String[] args) {
        List<Shape> l = new ArrayList<>();
        l.add(new Shape("삼각형", "빨간색", 10.5));
        l.add(new Shape("사각형", "파란색", 11.2));
        l.add(new Shape("원", "파란색", 16.5));
        l.add(new Shape("원", "빨간색", 5.3));
        l.add(new Shape("원", "노란색", 8.1));
        l.add(new Shape("사각형", "파란색", 20.7));
        l.add(new Shape("삼각형", "파란색", 3.4));
        l.add(new Shape("사각형", "빨간색", 12.6));

        System.out.print("사각형 : [");
        for (Shape i : ShapeTest.findShapesByType(l, "사각형")) {
            System.out.print(i.getType()+"(" + i.getColor() + "," + i.getArea() +"), ");
        }

    }
}

