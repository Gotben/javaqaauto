package ru.qa;

public class Programmtest {

    public static void main(String[] args) {
        hello("world");
        double l = 2;
        System.out.println(area(l));
        double a = 5;
        double b = 2;
        System.out.println(square(a,b));
    }

    public static void hello(String s) {
        System.out.println("Hello, " + s + "!");
    }

    public static double area(double len) {
        return len * len;

    }

    public static double square(double a, double b) {
        return a * b;
    }

}
