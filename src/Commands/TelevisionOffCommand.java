package Commands;

import Objects.Television;

public class TelevisionOffCommand implements Command{
    Television tv;

    public TelevisionOffCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }
}
