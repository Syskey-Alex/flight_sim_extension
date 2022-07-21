package com.company;

import Aeroplanes.*;

public class AirTrafficControl {

    public static void ATC() {
        F_14 jet = new F_14();
        Boeing747 boeing = new Boeing747();
        MiG_29 mig = new MiG_29();
        Su_57 su57 = new Su_57();
        jet.info();
        boeing.info();
        mig.info();
        su57.info();
    }
    /*
    Checks X and Y axis to see if the plane is on a trajectory towards colliding with eachother.
     - Altitude
     - positionX
     - positionY
     */
    public static void check(){


    }
}
