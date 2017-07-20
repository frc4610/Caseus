package org.usfirst.frc4610.Test;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import com.ctre.CANTalon;
import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */ 
public class RobotMap {
     
	 public static CANTalon driveTrainleftBack;
	 public static CANTalon driveTrainrightFront;
	 public static CANTalon driveTrainleftFront;
	 public static CANTalon driveTrainrightBack;
	 public static RobotDrive driveTrainRobotDrive41;

     public static SpeedController retrieveBeltSpeedController1;
     public static SpeedController scissorerScissors;
     
     public static DigitalInput scissorLimitSwitch1;
     public static DigitalInput scissorLimitSwitch2;
     
     public static SpeedController liftmotor;
     
 	// public static Servo servoCONTROLServo1L;
 	// public static Servo servoCONTROLServo2L;
 	// public static Servo servoCONTROLServo1R;
 	// public static Servo servoCONTROLServo2R;

    //public static AnalogInput ultraSONICAnalogInput;
     
 	 //public static SpeedController liftSpeedController1;
 	 //public static SpeedController liftSpeedController2;

     public static void init() {
         
       
    	 //CameraServer.getInstance().startAutomaticCapture();

    	
    	
    	driveTrainleftBack = new CANTalon(0);
    	 LiveWindow.addActuator("DriveTrain", "leftBack", driveTrainleftBack);
        
    	 driveTrainrightFront = new CANTalon(1);
    	 LiveWindow.addActuator("DriveTrain", "rightFront", driveTrainrightFront);
        
    	 driveTrainleftFront = new CANTalon(2);
    	 LiveWindow.addActuator("DriveTrain", "leftFront", driveTrainleftFront);
        
    	 driveTrainrightBack = new CANTalon(3);
    	 LiveWindow.addActuator("DriveTrain", "rightBack", driveTrainrightBack);
        
//    	 liftSpeedController1 = new VictorSP(5);
//    	 LiveWindow.addActuator("DriveTrain", "leftBack", driveTrainleftBack);
        
//    	 liftSpeedController2 = new VictorSP(6);
//    	 LiveWindow.addActuator("DriveTrain", "leftBack", driveTrainleftBack);
        
    	 scissorerScissors = new VictorSP(7);
    	 LiveWindow.addActuator("DriveTrain", "leftBack", driveTrainleftBack);
    	 
    	 liftmotor = new VictorSP(0);
    	 LiveWindow.addActuator("LiftSystem", "speed controller 2", (LiveWindowSendable) liftmotor);
    	 
    	 
        
        //servoCONTROLServo1L = new Servo(0);
        // LiveWindow.addActuator("Servo CONTROL", "Servo1L", servoCONTROLServo1L);
        
        // servoCONTROLServo2L = new Servo(1);
        //  LiveWindow.addActuator("Servo CONTROL", "Servo2L", servoCONTROLServo2L);
        
        // servoCONTROLServo1R = new Servo(2);
        //  LiveWindow.addActuator("Servo CONTROL", "Servo1R", servoCONTROLServo1R);
        
        // servoCONTROLServo2R = new Servo(3);
        //  LiveWindow.addActuator("Servo CONTROL", "Servo2R", servoCONTROLServo2R);
        
         retrieveBeltSpeedController1 = new VictorSP(4);
         LiveWindow.addActuator("RetrieveBelt", "Speed Controller 1", (VictorSP) retrieveBeltSpeedController1);
        
         driveTrainRobotDrive41 = new RobotDrive(driveTrainleftFront, driveTrainleftBack,
                 driveTrainrightFront, driveTrainrightBack);   
        
        
        driveTrainRobotDrive41.setSafetyEnabled(false);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(-1.0);

       // ultraSONICAnalogInput = new AnalogInput(0);
     //   LiveWindow.addSensor("Ultra SONIC", "Analog Input", ultraSONICAnalogInput);
        
        //LiveWindow.addSensor("UltraSONIC", "Sensor", ultraSONICAnalogInput);
        
        scissorLimitSwitch1 = new DigitalInput(1);
        LiveWindow.addSensor("scissor", "Limit Switch 1", scissorLimitSwitch1);
        scissorLimitSwitch2 = new DigitalInput(2);
        LiveWindow.addSensor("scissor", "Limit Switch 1", scissorLimitSwitch2);
    }
 
    
}
