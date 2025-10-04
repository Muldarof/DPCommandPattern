package Commands;

import Objects.CeilingFan;
import Objects.FanSpeed;

public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;
    FanSpeed prevFanSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        prevFanSpeed = ceilingFan.getFanSpeed();
    }

    public void execute() {
        prevFanSpeed = ceilingFan.getFanSpeed();
        ceilingFan.medium();
    }

    public void undo() {
        switch (prevFanSpeed) {
            case HIGH -> {
                ceilingFan.high();
            }
            case MEDIUM -> {
                ceilingFan.medium();
            }
            case LOW -> {
                ceilingFan.low();
            }
            case OFF -> {
                ceilingFan.off();
            }
        }
    }
}
