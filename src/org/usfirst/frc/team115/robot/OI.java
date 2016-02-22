package org.usfirst.frc.team115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team115.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
  private Joystick launchPad;
  
  public OI() {
    Joystick launchPad = new Joystick(0);
    
    new JoystickButton(launchPad, 0).toggleWhenPressed(new ExampleCommand () );
    
  }
  
  public Joystick getLaunchPad () { return launchPad; }
    
}
  
  

