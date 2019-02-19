/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.

  // Operator Controller Ports
  public static final int driverStickPort = 0;
  //public static final int operatorStickPort = 1;
  

  // Motor ports
  public static final int rightMotor1Port = 0;
  public static final int rightMotor2Port = 1;
  public static final int leftMotor1Port = 2;
  public static final int leftMotor2Port = 3;
  public static final int intakeMotorPort = 4;
  public static final int carriageLiftPort = 5;
  
  // PDP Channel Currents
  public static final int intakeCurrent = 4;

  // Constants
  public static final double DRIVE_THROTTLE_SMOOTH_CONSTANT = 0.06;
  public static final double DRIVE_YAW_SMOOTH_CONSTANT = 0.05;
  public static final double DEADBAND = 0.1;

  // Pneumatics
  public static final int intakeOutPort = 0;
  public static final int intakeInPort = 1;

  // Controller Buttons
  // Driver
  public static final int driver_A_button = 1;
  public static final int driver_B_button = 2;
  public static final int driver_X_button = 3;
  public static final int driver_Y_button = 4;
  public static final int driver_LB_button = 5;
  public static final int driver_RB_button = 6;
  public static final int driver_Back_button = 7;
  public static final int driver_Start_button = 8;

  // Operator
  public static final int operator_A_button = 1;
  public static final int operator_B_button = 2;
  public static final int operator_X_button = 3;
  public static final int operator_Y_button = 4;
  public static final int operator_LB_button = 5;
  public static final int operator_RB_button = 6;

  // Limit Switches
  public static final int intakeLimitPort = 0;
}
