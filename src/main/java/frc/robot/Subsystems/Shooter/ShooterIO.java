package frc.robot.Subsystems.Shooter;

import frc.robot.Constants.ShooterConstants.FlywheelSetPoint;
import org.littletonrobotics.junction.AutoLog;

public interface ShooterIO {

  @AutoLog
  public static class ShooterIOInputs {
    public double leftVoltage = 0.0; // Volts
    public double rightVoltage = 0.0; // Volts

    public double leftVelocity = 0.0; // RPM
    public double rightVelocity = 0.0; // RPM

    public double leftSetpoint = 0;
    public double rightSetpoint = 0;

    public boolean leftAtSetpoint = false;
    public boolean rightAtSetpoint = false;

    public double leftCurrent = 0.0; // Amps
    public double rightCurrent = 0.0; // Amps

    public double tofDistance = 0; // Inches
  }

  public default void updateInputs(ShooterIOInputs inputs) {}

  public default void changeSetpoint(FlywheelSetPoint Targets) {}
}
