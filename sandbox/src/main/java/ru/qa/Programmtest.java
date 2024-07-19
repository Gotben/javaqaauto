package ru.qa;

public class Programmtest {

    public static void main(String[] args) {
        hello("world");
        Square s = new Square(5);
        System.out.println(s.square());

        Rectangle r = new Rectangle(5,2);
        System.out.println(r.area());
    }

    public static void hello(String s) {
        System.out.println("Hello, " + s + "!");
    }

}
