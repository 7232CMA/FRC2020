/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class grabBallInCommand extends CommandGroup {
  /**
   * this command run the grabber and belt intake. Currently not in use 
   */
  public grabBallInCommand() {
    addParallel(new ballGrabberCommand(.6)); //1
    addParallel(new inTakeCommand(0.5)); //.5

  }
}
