/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Segway
 */
public class TwoStickArcadeCommand extends CommandBase {
    Joystick speedJoystick;
    Joystick turnJoystick;
    public TwoStickArcadeCommand(Joystick speedStick, Joystick turnStick) {
        requires (driveSubsystem);
        this.speedJoystick = speedStick;
        this.turnJoystick = turnStick;
    }


    // Called just before this Command runs the first time
    protected void initialize() {
      System.out.println("Switching to Two stick Arcade");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveSubsystem.arcadeDrive(-speedJoystick.getX(), -turnJoystick.getY());
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        driveSubsystem.stop();
    }
}
