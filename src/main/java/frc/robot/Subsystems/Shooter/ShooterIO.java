package frc.robot.Subsystems.Shooter;

import frc.robot.Constants.ShooterConstants.FlywheelSetPoint;
import org.littletonrobotics.junction.AutoLog;

public interface ShooterIO {

  @AutoLog
  public static class ShooterIOInputs {
    public double flywheelMotorVoltageL = 0.0; // Volts
    public double flywheelMotorVoltageR = 0.0; // Volts

    public double flywheelVelocityL = 0.0; // RPM
    public double flywheelVelocityR = 0.0; // RPM

    public double flywheelSetPointL = 0;
    public double flywheelSetPointR = 0;

    public boolean flywheelAtSetPointL = false;
    public boolean flywheelAtSetPointR = false;

    public double flywheelMotorCurrentL = 0.0; // Amps
    public double flywheelMotorCurrentR = 0.0; // Amps

    public double TOF_Distance = 0; // Inches
  }

  public default void updateInputs(ShooterIOInputs inputs) {}

  public default void newSetpoints(FlywheelSetPoint Targets) {}
}
