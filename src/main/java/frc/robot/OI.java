package frc.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.XboxController;;

public class OI{

    public XboxController gamepad1 = new XboxController(0);
    public XboxController gamepad2 = new XboxController(1);
    public JoystickButton buttonA = new JoystickButton(gamepad1, 1),
                            buttonB = new JoystickButton(gamepad1, 2),
                            buttonY = new JoystickButton(gamepad1, 3),
                            buttonX = new JoystickButton(gamepad1, 4),
                            buttonA2 = new JoystickButton(gamepad2, 1),
                            buttonB2 = new JoystickButton(gamepad2, 2),
                            buttonY2 = new JoystickButton(gamepad2, 3),
                            buttonX2 = new JoystickButton(gamepad2, 4);

    public OI(){
        
    }
}