/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.HatchIntakeCommand;
import frc.robot.commands.LockRamp;;

public class ServoSubsystem extends Subsystem {
  public Servo leftServo = new Servo(6);
  public Servo rightServo = new Servo(7);
  public Servo rampLockServo = new Servo(8);//TODO change this port number


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new HatchIntakeCommand());
    setDefaultCommand(new LockRamp());
  }
}
