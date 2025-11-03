package homework_20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test

    void shouldcanDrive() {
        // given
        Car peugeot = new Car(13, 7, 2025);

        // when
        boolean result = peugeot.canDrive();

        // then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldNotDriveWhenTankIsEmpty() {
        // given
        Car peugeot = new Car(0, 7, 2025);

        // when
        boolean result = peugeot.canDrive();

        // then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldCalculateRangeCorrectly() {
        // given
        Car peugeot = new Car(50, 10, 2025); // 50 л, 10 л/100 км

        // when
        int range = (int) peugeot.getRange();

        // then
        Assertions.assertEquals(500, range);
    }

}