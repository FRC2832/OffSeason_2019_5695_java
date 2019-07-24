package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

class Mechanisms {

    WPI_TalonSRX elev;
    WPI_TalonSRX endTilt;
    WPI_TalonSRX arm;
    WPI_TalonSRX ingestR;
    WPI_TalonSRX ingestL;

    public Mechanisms() {

        elev = new WPI_TalonSRX(1);
        endTilt = new WPI_TalonSRX(3);
        arm = new WPI_TalonSRX(14);
        ingestL = new WPI_TalonSRX(0);
        ingestR = new WPI_TalonSRX(15);
    }
    public void driveElevator(double speed){
        elev.set(.5);
    }
    public void driveTilt(double speed){
        endTilt.set(.5);
    }
    public void driveArm(Boolean speed){
        arm.set(.5);
    }
    public void driveIngestorRUp(double speed){
        ingestR.set(.5);
    }
    public void driveIngestorRDown(double speed){
        ingestR.set(-.5);
    }
    public void driveIngestorLUp(double speed){
        ingestL.set(.5);
    }
    public void driveIngestorLDown(double speed){
        ingestL.set(-.5);
    }
}