//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot(); //create a new Robot object
        myRobot.move(); //Make the robot move
        myRobot.checkBatteryLevel(); // Check battery level
        myRobot.stop(); // Stop the robot
        myRobot.chargeBattery(); // Charge the robot's battery
        myRobot.language();
        myRobot.displayInfo();

    }
}