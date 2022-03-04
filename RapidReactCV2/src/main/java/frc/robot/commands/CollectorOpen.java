package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Collector;

public class CollectorOpen extends CommandBase {

    @Override
    public void initialize() {
        addRequirements(Collector.getInstance());
    }
    
    @Override
    public void execute() {
        Collector.getInstance().open(Constants.Speeds.collectorOpen);
    }

    @Override
    public boolean isFinished() {
        return Collector.getInstance().isDown(); // stop if microswitch was pressed
    }

    @Override
    public void end(boolean interrupted) {
        Collector.getInstance().stopMotor(); // completely stop motor movements
    }
    
}
