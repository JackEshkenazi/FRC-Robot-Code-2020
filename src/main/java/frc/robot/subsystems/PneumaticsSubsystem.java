/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.IntakeCarriageOffCommand;

public class PneumaticsSubsystem extends Subsystem {
  public Compressor c = new Compressor(0);
  public DoubleSolenoid intake = new DoubleSolenoid(0, 1);
  public DoubleSolenoid ramp = new DoubleSolenoid(2, 3);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new IntakeCarriageOffCommand());
  }
}
