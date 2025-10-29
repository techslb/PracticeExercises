/*
Description:
A simple toy droid project to work on OOP programming concepts
*/

class Droid{
  public Droid(String droidName){
    // constructor
    name = droidName;
    batteryLevel = 100;
  }
  // instance field
  String name;
  int batteryLevel;

  // class method
  public void energyReport(){
    System.out.println(batteryLevel);
  }
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task + ".");
    batteryLevel -= 10;
  }
  public String toString(){
    return "Hello, I'm the droid: " + name + "!";
  }

  public static void main(String[] args){
    // instancing a new Droid
    Droid myDroid = new Droid("Codey");
    // testing toString() method
    System.out.println(myDroid);
    // testing performTask() method
    myDroid.performTask("chess");
    // testing batteryLevel changes
    myDroid.performTask("eating memory");
    myDroid.energyReport();
    // new instance
    Droid papaDroid = new Droid("Papa");
    // testing new instance toString()
    System.out.println(papaDroid);
    papaDroid.performTask("babysitting");
    papaDroid.energyReport();
    
  }
}
