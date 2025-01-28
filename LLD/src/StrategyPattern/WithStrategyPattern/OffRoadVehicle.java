package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.WithStrategyPattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new SportDriveStrategy() {
        });
    }
}
