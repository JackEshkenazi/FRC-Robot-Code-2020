/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.HatchIntakeCommand;
import frc.robot.commands.HatchOuttakeCommand;
import frc.robot.commands.IntakeCarriageInCommand;
import frc.robot.commands.IntakeCarriageOutCommand;
import frc.robot.commands.IntakeRollerIntakeCommand;
import frc.robot.commands.IntakeRollerOuttakeCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.

  // Joysticks
  public Joystick driverStick = new Joystick(RobotMap.driverStickPort);
  //public Joystick operatorStick = new Joystick(RobotMap.operatorStickPort);


  // Buttons
  public JoystickButton intakeCarriageOut = new JoystickButton(driverStick, RobotMap.driver_A_button);
  public JoystickButton intakeCarriageIn = new JoystickButton(driverStick, RobotMap.driver_B_button);
  public JoystickButton hatchIn = new JoystickButton(driverStick, RobotMap.driver_X_button);
  public JoystickButton hatchOut = new JoystickButton(driverStick, RobotMap.driver_Y_button);
  public JoystickButton spinIntake = new JoystickButton(driverStick, RobotMap.driver_LB_button);
  public JoystickButton outtakeCargo = new JoystickButton(driverStick, RobotMap.driver_RB_button);

  public OI(){
    // Button Binding
    intakeCarriageOut.whenPressed(new IntakeCarriageOutCommand());
    intakeCarriageIn.whenPressed(new IntakeCarriageInCommand());
    hatchIn.whenPressed(new HatchIntakeCommand());
    hatchOut.whenPressed(new HatchOuttakeCommand());
    spinIntake.whileHeld(new IntakeRollerIntakeCommand());
    outtakeCargo.whileHeld(new IntakeRollerOuttakeCommand());
  }

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());



  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

}