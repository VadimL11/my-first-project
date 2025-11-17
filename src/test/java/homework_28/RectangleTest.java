package homework_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void calculateArea() {
        // given
        Shape rectangle = new Rectangle(4, 7);

        // when
        double result = rectangle.calculateArea();

        // then
        Assertions.assertEquals(28, result);
    }

    @Test
    void calculatePerimeter() {
        // given
        Shape rectangle = new Rectangle(4, 7);

        // when
        double result = rectangle.calculatePerimeter();

        // then
        Assertions.assertEquals(22, result);
    }
}