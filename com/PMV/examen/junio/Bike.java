package com.PMV.examen.junio;


class Bike {  
  private int speed;
  private int gear;
    
  public int getSpeed() {
    return speed;
  }


  public void setSpeed(int speed) {
    this.speed = speed;
  }


  public int getGear() {
    return gear;
  }


  public void setGear(int gear) {
    this.gear = gear;
  }


  public void changeGear(int newGear){     
      gear = newGear;
  }
    
  
  public void speedUp(int increment){
      speed = speed + increment;
  }
    
  public void applyBrakes(int decrement){     
      speed = speed - decrement;
  }
    
  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }


@Override
public String toString() {
	return "Bike [speed=" + speed + ", gear=" + gear + "]";
}
  
}

//class Bike implements Vehicle {
//    
//  int speed;
//  int gear;
//
//  @Override
//  public void changeGear(int newGear){
//        
//      gear = newGear;
//  }
//    
//  @Override
//  public void speedUp(int increment){
//        
//      speed = speed + increment;
//  }
//
// @Override
//  public void applyBrakes(int decrement){
//        
//      speed = speed - decrement;
//  }
//    
//  public void printStates() {
//      System.out.println("speed: " + speed
//          + " gear: " + gear);
//  } 
//}

//class GFG {
//    
//  public static void main (String[] args) {
//    
//      // creating an inatance of Bike
//      // doing some operations
//      Bike bicycle = new Bike();
//      bicycle.changeGear(2);
//      bicycle.speedUp(3);
//      bicycle.applyBrakes(1);
//        
//      System.out.println("Bike present state :");
//      bicycle.printStates();
//        
//      // creating instance of the bike.
//      Bike bike = new Bike();
//      bike.changeGear(1);
//      bike.speedUp(4);
//      bike.applyBrakes(3);
//        
//      System.out.println("Bike present state :");
//      bike.printStates();
//  }
//}