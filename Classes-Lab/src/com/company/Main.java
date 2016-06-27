package com.company;

/* Instantiate a StopLight object in the Main.java class using the constructor you created in the StopLight class.
Instantiate a Car object in the Main.java class using the constructor you created in the Car class.
In the Main.java class, create a loop(while, do while, for loop; your choice) that runs 30 times.
Inside the loop; change the lightColor of the StopLight object in the correct sequence and have the Car object react
accordingly to the StopLight lightColor using the Car object's methods for each iteration. (Each time you loop back,
change the lightColor)
*/


public class Main {


    public static void main(String[] args) {

        Car one = new Car("red", "corvette", 200);
        //one.go();

        //Car two = new Car("blue", "corvette", 200);
        //two.stop();

        //Car three = new Car("silver", "corvette", 200);
        //three.slow();

        StopLight stopLight = new StopLight();

        for (int i = 0; i < 30; i++) {
            stopLight.isRed();
            one.stop();
            stopLight.isYellow();
            one.slow();
            stopLight.isGreen();
           one.go();


        }
    }

}
