package Commands;

import Objects.Hottub;

public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jetsOn();
        hottub.circulate();
        hottub.setTemperature(80);
    }

    public void undo() {
        hottub.jetsOff();
    }
}
