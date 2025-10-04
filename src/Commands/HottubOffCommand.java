package Commands;

import Objects.Hottub;

public class HottubOffCommand implements Command{
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jetsOff();
    }

    public void undo() {
        hottub.jetsOn();
        hottub.circulate();
        hottub.setTemperature(80);
    }
}
