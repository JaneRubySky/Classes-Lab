package com.company;

/* Create a StopLight class with the following global variable: lightColor
Create a constructor that sets the lightColor to a value of your choice.
Create the following methods that accept no input: isRed, isYellow, isGreen.
Implement the methods to return true when the lightColor matches the color of the method. i.e; isRed() should return true
if lightColor is red.
Create a method setLightColor, that accepts a parameter to change the lightColor variable. Make sure to handle when the
 wrong input is given to the method. */

/**
 * Created by janerubygrissom on 6/27/16.
 */
public class StopLight {

    String mlightColor = "";

    public StopLight() {
    }

    public StopLight(String color) {

        if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow") || color.equalsIgnoreCase("green")) {
            mlightColor = color.toLowerCase();
        } else {
            mlightColor = "yellow";
        }
    }

    public boolean isRed() {
        if (mlightColor.equals("red")) {
            return true;
        }
        return false;
    }

    public boolean isYellow() {
        if (mlightColor.equals("yellow")) {
            return true;
        }
        return false;
    }

    public boolean isGreen() {
        if (mlightColor.equals("green")) {
            return true;
        }
        return false;
    }

    public void setLightColor(String lightColor) {

        mlightColor = lightColor.toLowerCase();

        if (lightColor.equalsIgnoreCase("red") || lightColor.equalsIgnoreCase("yellow") || lightColor.equalsIgnoreCase("green")) {
            mlightColor = lightColor.toLowerCase();
        } else {
            mlightColor = "yellow";
        }

    }
}


