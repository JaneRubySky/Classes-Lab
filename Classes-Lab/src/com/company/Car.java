package com.company;

/* Create a Car class with the following global variables: color, brand, topSpeed
Create a constructor that assigns values to the color, brand, and topSpeed variables.
Implement go, slow, and stop methods that print something out. (You can print whatever is appropriate for the methods)
Create individual getter methods that print out the color, brand, and topSpeed of the car.
Create individual setter methods that set the color, brand, and topSpeed of the car. */

/**
 * Created by janerubygrissom on 6/27/16.
 */
public class Car {

    int mTopSpeed;
    String mColor;
    String mBrand;

    public String getColor() {
        return mColor;
    }

    public void setColor(String mColor) {
        this.mColor = mColor;
    }

    public String getBrand() {
        return mBrand;
    }

    public void setBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int mTopSpeed) {
        this.mTopSpeed = mTopSpeed;
    }

    public Car(String color, String brand, int topSpeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go(){
        System.out.println("Go " + mColor + " " + mBrand);

    }

    public void slow(){
        System.out.println("Slow " + mColor + " " + mBrand);
    }

    public void stop(){
        System.out.println("Stop " + mColor + " " + mBrand);
    }


}


