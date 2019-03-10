/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.CarriageDownCommand;
import frc.robot.commands.CarriageUpCommand;
import frc.robot.commands.DeployRampCommand;
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

  // Joysticks
  public Joystick driverStick = new Joystick(RobotMap.driverStickPort);
  public Joystick operatorStick = new Joystick(RobotMap.operatorStickPort);


  // Buttons
  public JoystickButton intakeCarriageOut = new JoystickButton(operatorStick, RobotMap.operator_RB_button);
  public JoystickButton intakeCarriageIn = new JoystickButton(operatorStick, RobotMap.operator_LB_button);
  public JoystickButton hatchIn = new JoystickButton(operatorStick, RobotMap.operator_B_button);
  public JoystickButton hatchOut = new JoystickButton(operatorStick, RobotMap.operator_X_button);
  public JoystickButton spinIntake = new JoystickButton(driverStick, RobotMap.driver_LB_button);//changed from rb
  public JoystickButton outtakeCargo = new JoystickButton(driverStick, RobotMap.driver_RB_button);
  public JoystickButton rampLock1 = new JoystickButton(operatorStick, RobotMap.operator_Start_button);
  //public JoystickButton rampLock2 = new JoystickButton(driverStick, RobotMap.driver_LB_button);
  public JoystickButton liftCarriage = new JoystickButton(operatorStick, RobotMap.operator_A_button);
  public JoystickButton lowerCarriage = new JoystickButton(operatorStick, RobotMap.operator_Y_button);

  public OI(){
    // Button Binding
    intakeCarriageOut.whenPressed(new IntakeCarriageOutCommand());
    intakeCarriageIn.whenPressed(new IntakeCarriageInCommand());
    hatchIn.whenPressed(new HatchIntakeCommand());
    hatchOut.whenPressed(new HatchOuttakeCommand());
    spinIntake.whileHeld(new IntakeRollerIntakeCommand());
    outtakeCargo.whileHeld(new IntakeRollerOuttakeCommand()); 
    liftCarriage.whileHeld(new CarriageUpCommand());
    lowerCarriage.whileHeld(new CarriageDownCommand());
    rampLock1.whenPressed(new DeployRampCommand());
  }
}