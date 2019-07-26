package frc.robot.command;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.Mechanisms;

public class Tilt {

    Mechanisms mech;

    public Tilt() {
        mech = new Mechanisms();

    }

    public void tilt() {
        mech.endTilt.set(.5);
    }
    

    

}