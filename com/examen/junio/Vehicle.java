package com.examen.junio;

/**
 * Representa la clase Vehicle
 * <p>
 * Un vehiculo tiene los siguientes atributos:
 * <ol>
 * <li>speed. Indica la velocidad del vehiculo</li>
 * <li>gear. Indica la marcha del vehiculo</li>
 * </ol>
 * 
 * @author Pablo Merida
 * 
 */

public class Vehicle {

  /**
   * Velocidad del vehiculo
   */
  protected int speed;

  /**
   * Obtiene la velocidad del vehiclo
   * @return velocidad del vehiculo
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * Cambia la velocidad del vehiculo
   * @param speed
   */
  public void setSpeed(int speed) {
    this.speed = speed;
  }
/**
 * Obtiene la marcha del vehiculo
 * @return marcha del vehiculo
 */
  public int getGear() {
    return gear;
  }

  /**
   * Cambia la marcha del vehiculo
   * @param gear
   */
  public void setGear(int gear) {
    this.gear = gear;
  }
/**
 * Marcha del vehiculo
 */
  protected int gear;

  public Vehicle() {
    super();
  }

  /**
   * Cambia la marcha del vehiculo
   * @param newGear
   */
  public void changeGear(int newGear) {     
      gear = newGear;
  }

  /**
   * Acelera el vehiculo
   * @param increment
   */
  public void speedUp(int increment) {
      speed = speed + increment;
  }

  /**
   * Frena el vehiculo
   * @param decrement
   */
  public void applyBrakes(int decrement) {     
      speed = speed - decrement;
  }

  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }

}
