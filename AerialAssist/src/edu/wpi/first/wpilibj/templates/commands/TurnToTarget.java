/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author FRC
 */
public class TurnToTarget extends CommandBase {
    Joystick stick;
    public TurnToTarget(Joystick stick) {
        this.stick = stick;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (stick.getRawButton(9)) {
            if (networkTableUse.shapeXAxis() > 350) {
            driveSubsystem.arcadeDrive(0, 0.5);
            } else if (networkTableUse.shapeXAxis() < 250) {
            driveSubsystem.arcadeDrive(0, -0.5);
            } else if ((networkTableUse.shapeXAxis() > 250) && (networkTableUse.shapeXAxis() < 350)) {
            driveSubsystem.arcadeDrive(0.5, 0);
            } else {
            driveSubsystem.arcadeDrive(0, 0);
            }
        }
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
    }
}
