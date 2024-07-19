package ru.qa;

import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testSquare() {
        Square s = new Square(5);
        assert s.square() == 25;
    }

}
