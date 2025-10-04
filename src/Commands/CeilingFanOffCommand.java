package Commands;

import Objects.CeilingFan;
import Objects.FanSpeed;

public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    FanSpeed prevFanSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        prevFanSpeed = ceilingFan.getFanSpeed();
    }

    public void execute() {
        ceilingFan.off();
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
