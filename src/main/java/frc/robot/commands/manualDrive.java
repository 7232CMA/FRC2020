
package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;





public class manualDrive extends Command {
    public manualDrive() {
      // Use requires() here to declare subsystem dependencies
      // eg. requires(chassis);
      requires(Robot.driveTrain);
    }
  
    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
  
    }
  
    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
          double driveLeft = Robot.oi.joystickDrive.getRawAxis(1);
          double driveRight = Robot.oi.joystickDrive.getRawAxis(5);
          System.out.println(driveRight);
        
          Robot.driveTrain.tankDrive(driveLeft, driveRight);
    }
  
    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
      return false;
    }
  
    // Called once after isFinished returns true
    @Override
    protected void end() {
      Robot.driveTrain.tankDrive(0,0);
    }
  
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
      end();
    }
  }