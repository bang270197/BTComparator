package com.company;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.0);
        circles[1] = new Circle();
        circles[2] = new Circle(5.0, "black", true);
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);

        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
