import StrategyPattern.WithStrategyPattern.Sportsvehicle;
import StrategyPattern.WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Sportsvehicle();
        vehicle.drive();
    }
}