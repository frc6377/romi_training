package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousTriangle extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousTriangle(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(0.5, 10, drivetrain),
        new TurnDegrees(0.5, 120, drivetrain),
        new DriveDistance(0.5, 10, drivetrain),
        new TurnDegrees(0.5, 120, drivetrain),
        new DriveDistance(0.5, 10, drivetrain),
        new TurnDegrees(0.5, 120, drivetrain));
  }

  public AutonomousTriangle something(){
    return this;
  }
}