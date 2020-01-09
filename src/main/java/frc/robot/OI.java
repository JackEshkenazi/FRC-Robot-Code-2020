/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  // Joysticks
  public Joystick driverStick = new Joystick(RobotMap.driverStickPort);
  public Joystick operatorStick = new Joystick(RobotMap.operatorStickPort);


  // Buttons
  public JoystickButton operator_RB_button = new JoystickButton(operatorStick, RobotMap.operator_RB_button);
  public JoystickButton operator_LB_button = new JoystickButton(operatorStick, RobotMap.operator_LB_button);
  public JoystickButton operator_B_button = new JoystickButton(operatorStick, RobotMap.operator_B_button);
  public JoystickButton operator_X_button = new JoystickButton(operatorStick, RobotMap.operator_X_button);
  public JoystickButton driver_LB_button = new JoystickButton(driverStick, RobotMap.driver_LB_button);//changed from rb
  public JoystickButton driver_RB_button = new JoystickButton(driverStick, RobotMap.driver_RB_button);
  public JoystickButton operator_Start_button = new JoystickButton(operatorStick, RobotMap.operator_Start_button);
  //public JoystickButton rampLock2 = new JoystickButton(driverStick, RobotMap.driver_LB_button);
  public JoystickButton operator_A_button = new JoystickButton(operatorStick, RobotMap.operator_A_button);
  public JoystickButton operator_Y_button = new JoystickButton(operatorStick, RobotMap.operator_Y_button);

  public OI(){
  }
}