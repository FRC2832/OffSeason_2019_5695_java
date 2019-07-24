package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI{

   public Joystick joystick1;
   public Joystick joystick2;
   public JoystickButton button1;

    public OI(){

        joystick1 = new Joystick(0);
        joystick2 = new Joystick(1);
        button1 = new JoystickButton(joystick1, 1);
    }
}