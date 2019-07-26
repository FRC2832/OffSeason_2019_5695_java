package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Mechanisms {

    WPI_TalonSRX elev;
    public WPI_TalonSRX endTilt;
    public WPI_TalonSRX arm;
    public WPI_TalonSRX ingestR;
    public WPI_TalonSRX ingestL;

    public Mechanisms() {

        elev = new WPI_TalonSRX(1);//done
        endTilt = new WPI_TalonSRX(3);//done
        arm = new WPI_TalonSRX(14);
        ingestL = new WPI_TalonSRX(0);
        ingestR = new WPI_TalonSRX(15);
    }
    public void driveElevator(double speed){
       elev.set(speed);
    }
    /*public void driveTilt(double speed){
        endTilt.set(speed);
    }
    public void driveArm(double speed){
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
    }*/
}