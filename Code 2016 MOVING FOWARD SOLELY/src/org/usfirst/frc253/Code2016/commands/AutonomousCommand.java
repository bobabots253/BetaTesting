// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2016.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc253.Code2016.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class AutonomousCommand extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public AutonomousCommand() {
    	 
    	
//    	try {
//		    Thread.sleep(3000);
//	    	//Robot.ballPickUp.goup();
//	    	
//	    	Robot.drivetraintank.setLeft_Back(0.5);
//	    	Robot.drivetraintank.setLeft(0.5);
//	    	Robot.drivetraintank.setRight(0.5);
//	    	Robot.drivetraintank.setRight_Back(0.5);
//		    //put methods to call or whatever u want to pause 3 seconds here
//		} catch(InterruptedException ex) {
//		    //Thread.currentThread().interrupt();
//			end();
//			Robot.drivetraintank.setLeft_Back(0);
//	    	Robot.drivetraintank.setLeft(0);
//	    	Robot.drivetraintank.setRight(0);
//	    	Robot.drivetraintank.setRight_Back(0);
//	    	}
		requires(Robot.ballPickUp);
		requires(Robot.liftSystem);
		
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
   	setTimeout(2.2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	  if(myTimer.get() < 2.0){
          	Robot.drivetraintank.setLeft_Back(-.5);
          	Robot.drivetraintank.setLeft(-0.5);
          	Robot.drivetraintank.setRight(-0.6);
          	Robot.drivetraintank.setRight_Back(-0.6);
//          	Robot.ballPickUp.FullStop();
//          } else if (myTimer.get() < 3.0){
//          	Robot.drivetraintank.setLeft_Back(0.1);
//          	Robot.drivetraintank.setLeft(-0.1);
//          	Robot.drivetraintank.setRight(0.0);
//          	Robot.drivetraintank.setRight_Back(0.0);
//              myTimer.stop();
//              Robot.ballPickUp.FullStop();
//          }
//          // If more than 2 seconds have elapsed, stop driving and turn off the timer
//          else {
//          	Robot.drivetraintank.setLeft_Back(0.0);
//          	Robot.drivetraintank.setLeft(0.0);
//          	Robot.drivetraintank.setRight(0.0);
//          	Robot.drivetraintank.setRight_Back(0.0);
//              
//              Robot.ballPickUp.FullStop();
//              myTimer.stop();
//          }
          	Robot.ballPickUp.FullStop();
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
		Robot.drivetraintank.setLeft_Back(.1);
    	Robot.drivetraintank.setLeft(-.1);
    	Robot.drivetraintank.setRight(0);
    	Robot.drivetraintank.setRight_Back(0);

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
//    	Robot.drivetraintank.setLeft_Back(0);
//    	Robot.drivetraintank.setLeft(0);
//    	Robot.drivetraintank.setRight(0);
//    	Robot.drivetraintank.setRight_Back(0);
//    	end();
    }
}