package homework_20;

import lombok.*;
import java.time.Year;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Car {

    private int fuelLevel;
    private int fuelConsumption;
    private int nextInspectionYear;


    public boolean canDrive() {
        return fuelLevel > 0;
    }


    public boolean isAllowedToDrive() {
        int currentYear = Year.now().getValue();
        return currentYear <= nextInspectionYear;
    }


    public int getRange() {
        return (int) (((double) fuelLevel / fuelConsumption) * 100.0);
    }
}