package frc.robot;

import com.ctre.phoenix.motorcontrol.StatorCurrentLimitConfiguration;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Define all the ports used in the robot here 
 * Motor ports 
 * Joystick ports
 */
public class RobotMap {
    //Talon Motor Ports Defined For DriveTrain
    public static int DRIVETRAIN_LEFT_FRONT_Talon = 7; //7
    public static int DRIVETRAIN_LEFT_REAR_Talon = 2; //2

    public static int DRIVETRAIN_RIGHT_FRONT_PWM = 0; //0
    public static int DRIVETRAIN_RIGHT_REAR_PWM= 1; //1

    //Talon Motor For Shooter
    public static int SHOOTER_TOP_Talon= 8;
    public static int SHOOTER_BOTTOM_Talon = 6;
    //inTake motors 
    public static int INTAKE_BELT = 1;
    //Grabber Motors 
    public static int GRABBER_GRAB_Talon = 5; //verfied 
    //JoyStick Ports 
    public static int JOYSTICK_DRIVE_CONTROLLER = 0;
    public static int JOYSTICK_GAME_CONTROLLER = 1;
    //Button Shoot = new JoystickButton(Robot.oi.joystickDrive, 1);

}

