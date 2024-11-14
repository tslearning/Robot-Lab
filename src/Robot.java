public class Robot {
    int batteryLevel = 100; // Battery level percentage (0 to 100)
    int speed = 0; // Current speed of the robot
    String name = "Robo"; // Name of the robot
    String height = "10 ft tall";
    int weight = 300 ;
    String color = "red";


    public void move() {
        speed = 5;
        System.out.println(name + " is moving at speed " + speed + " mph.");
    }

    public void stop() {
        speed = 0;
        System.out.println(name + " has stopped");
    }

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged.");
    }

    public void checkBatteryLevel() {
        System.out.println(name + "'s current battery level is " + batteryLevel);
    }

    public void language(){
        System.out.println(name + " can speak IOS and Android.");
    }

    public void displayInfo(){
        System.out.println(name + " is " + color + " and weigh " + weight + " pounds.");

    }

}
