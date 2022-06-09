package com.PMV.examen.junio;



public class Vehicle {

  protected int speed;
  protected int gear;

  public Vehicle() {
    super();
  }

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

  public void changeGear(int newGear) {     
      gear = newGear;
  }

  public void speedUp(int increment) {
      speed = speed + increment;
  }

  public void applyBrakes(int decrement) {     
      speed = speed - decrement;
  }

  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }

}
