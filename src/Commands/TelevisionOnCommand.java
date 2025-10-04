package Commands;

import Objects.Television;

public class TelevisionOnCommand implements Command{
    Television tv;

    public TelevisionOnCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
