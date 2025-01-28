package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.WithStrategyPattern.Strategy.SportDriveStrategy;

public class Sportsvehicle extends Vehicle {
    public Sportsvehicle(){
        super(new SportDriveStrategy());
    }
}
