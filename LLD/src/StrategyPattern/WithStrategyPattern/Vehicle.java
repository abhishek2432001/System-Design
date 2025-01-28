package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    Vehicle(DriveStrategy driveObject){
        this.driveObject = driveObject;
    }

    public void drive(){

        driveObject.drive();
    }
}
