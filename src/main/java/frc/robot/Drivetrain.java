/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {

    /*
  gs = gear shift
  r = right
  l = left
  f = front
  b = back
  tank = tank
  */

  WPI_TalonSRX rf;
  WPI_TalonSRX lf;
  WPI_TalonSRX rb;
  WPI_TalonSRX lb;

  SpeedControllerGroup l;
  SpeedControllerGroup r;

  DifferentialDrive arcade;
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Drivetrain(){
  
    rf = new WPI_TalonSRX(10);
    lf = new WPI_TalonSRX(2);
    rb = new WPI_TalonSRX(12);
    lb = new WPI_TalonSRX(11);
    
    l = new SpeedControllerGroup(lf, lb);
    r = new SpeedControllerGroup(rf, rb);
    arcade = new DifferentialDrive(l, r);

  }

  @Override
  public void initDefaultCommand() {

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
