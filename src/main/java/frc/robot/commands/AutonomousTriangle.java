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
    for(int count = 0; count<3; count++)
    addCommands(
        new DriveDistance(0.5, 10, drivetrain),
        new TurnDegrees(0.5, 80, drivetrain),
  }

  public AutonomousTriangle something(){
    return this;
  }
}