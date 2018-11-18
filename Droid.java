/*  -A Hovering Droid-
      Program that simulateds a Droid with
      .activate .hover .checkBatteryLevel
      Methods
      .chargeBattery
      Method takes integer hours and adds it to the batteryLevel
*/
public class Droid {
  
  static int batteryLevel;
  
  Droid() {
    batteryLevel = 100;
  }
  
  public static void activate() {
    System.out.println("Activated. How can I help you?");
    batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is: " +batteryLevel+ " percent.");
  }
  
  public static void chargeBattery(int hours) {
    System.out.println("Droid charging");
    if (batteryLevel + hours > 100) {
      batteryLevel = 100;
      System.out.println("Battery level is " +batteryLevel+ " percent.");
    } else {
      batteryLevel = batteryLevel + hours;
      System.out.println("Battery level is " +batteryLevel+ " percent.");
    }
  }
  
  public static int checkBatteryLevel() {
    System.out.println("Battery level is " +batteryLevel+ " percent.");
    return(batteryLevel);
  }
  
  public static void hover(int feet) {
    if (feet > 2) {
      System.out.println("Error! I cannot hover above 2 feet.");
    } else {
      System.out.println("Hovering...");
      batteryLevel = batteryLevel - 20;
      System.out.println("Battery level is " +batteryLevel+ " percent.");
    }
  }
  
  public static void main(String[] args){
    Droid markle = new Droid();
    markle.activate();
    markle.chargeBattery(5);
    markle.hover(2);
  }
  
}