/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Move extends Command {
  double m_time , m_rSpeed,m_lSpeed;
  public Move(double time ,double lSpeed ,double rSpeed) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    m_time = time;
    m_lSpeed = lSpeed;
    m_rSpeed = rSpeed;
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.driveTrain.tankDrive(m_lSpeed,m_rSpeed); 
    setTimeout(m_time);
  }  

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {   
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {

    return isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveTrain.tankDrive(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
