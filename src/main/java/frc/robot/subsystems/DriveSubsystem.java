/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Spark rightMotor1 = new Spark(RobotMap.rightMotor1Port);
  public Spark rightMotor2 = new Spark(RobotMap.rightMotor2Port);
  public Spark leftMotor1 = new Spark(RobotMap.leftMotor1Port);
  public Spark leftMotor2 = new Spark(RobotMap.leftMotor2Port);

  // Groups the left and right motors into one controller
  public SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightMotor1, rightMotor2);
  public SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftMotor1, leftMotor2);

  // Initializes the differential drive object
  public DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  // Initialize motor speeds
  double throttlePower = 0.0;
  double yawPower = 0.0;

  public void manualDrive(double throttle, double yaw) {
    
    if (throttle > throttlePower + RobotMap.DRIVE_THROTTLE_SMOOTH_CONSTANT) {
      throttlePower += RobotMap.DRIVE_THROTTLE_SMOOTH_CONSTANT;
    } else if (throttle < throttlePower - RobotMap.DRIVE_THROTTLE_SMOOTH_CONSTANT) {
      throttlePower -= RobotMap.DRIVE_THROTTLE_SMOOTH_CONSTANT;
    }

    if (yaw > yawPower + RobotMap.DRIVE_YAW_SMOOTH_CONSTANT) {
      yawPower += RobotMap.DRIVE_YAW_SMOOTH_CONSTANT;
    } else if (yaw < yawPower + RobotMap.DRIVE_YAW_SMOOTH_CONSTANT) {
      yawPower -= RobotMap.DRIVE_YAW_SMOOTH_CONSTANT;
    }

    
    drive.arcadeDrive(throttlePower, yaw);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveCommand());
  }
}
