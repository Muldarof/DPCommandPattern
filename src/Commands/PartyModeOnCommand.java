package Commands;

public class PartyModeOnCommand implements Command{
    AllLightsOnCommand allLightsOnCommand;
    StereoOnWithCDCommand stereoOnWithCDCommand;

    public PartyModeOnCommand(AllLightsOnCommand allLightsOnCommand, StereoOnWithCDCommand stereoOnWithCDCommand) {
        this.allLightsOnCommand = allLightsOnCommand;
        this.stereoOnWithCDCommand = stereoOnWithCDCommand;
    }

    public void execute() {
        allLightsOnCommand.execute();
        stereoOnWithCDCommand.execute();
    }
}
