/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author delores
 */
public class Car extends Vehicle {
  int numOfDoors;
  int currentGear;
  double totalMiles;
  
  // no args constructor
  public Car(){
      
  }
  
  @Override
  public void turn(int deg){
      // placeholder implementation which just
      // adds incoming degrees to current heading
      headingInDeg = headingInDeg + deg;
  }
  
  // full args constructor
  public Car(int numDoors, int ms, int year, String ftype){
      super(ms, year, ftype);
      numOfDoors = numDoors;
      currentGear = 0;
      totalMiles = 0;
  }
  
}
