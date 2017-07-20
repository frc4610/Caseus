// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4610.Test;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import org.usfirst.frc4610.Test.subsystems.Lift;
//import org.usfirst.frc4610.Test.subsystems.ServoCONTROL;
import org.usfirst.frc4610.Test.RobotMap;
import org.usfirst.frc4610.Test.commands.*;
import org.usfirst.frc4610.Test.subsystems.*;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	SendableChooser chooser;
	Command AutonomousCommand;
	
	

   
	public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static Retrievebelt retrieveBelt;
    public static Scissorer scissorer;
    public static LiftSystem liftsystem;
    //public static Lift lift;
   // public static ServoCONTROL servoCONTROL;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	//REDEFFINITIONS
        driveTrain = new DriveTrain();
        retrieveBelt = new Retrievebelt();
        scissorer = new Scissorer();
        liftsystem = new LiftSystem();
        //lift = new Lift();
       // servoCONTROL = new ServoCONTROL();
       
        
        


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        	chooser = new SendableChooser();
        	chooser.addDefault("Default auto", new AutonomousCommand());
        	SmartDashboard.putData("auto mode", chooser);
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
    
    	AutonomousCommand = (AutonomousCommand) chooser.getSelected();
       	if (AutonomousCommand != null) AutonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
   //     double volts = RobotMap.ultraSONICAnalogInput.getValue();
   //     volts = volts * .003 + 2; // now gives inches
   //     SmartDashboard.putNumber("Right", volts);
   //     if(volts>9)
     //   {
      //  	RobotMap.servoCONTROLServo1L.set(0);
        	
   //     }
   //     else if(volts<4)
    //    {
        //	RobotMap.servoCONTROLServo1L.set(1);
    //    }
   }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
       
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
