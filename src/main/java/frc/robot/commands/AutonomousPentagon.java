package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousPentagon extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousPentagon(Drivetrain drivetrain) {
    for(int count = 0; count<5; count++)
    addCommands(
        new DriveDistance(0.5, 40, drivetrain),
        new TurnDegrees(0.5, 108, drivetrain));
  }

  public AutonomousPentagon something(){
    return this;
  }
}