package homework_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void calculateArea() {
        // given
        Shape circle = new Circle(5);

        // when
        double result = circle.calculateArea();

        // then
        Assertions.assertEquals(78.5398, result, 0.0001);
    }

    @Test
    void calculatePerimeter() {
        // given
        Shape circle = new Circle(5);

        // when
        double result = circle.calculatePerimeter();

        // then
        Assertions.assertEquals(31.4159, result, 0.0001);
    }
}