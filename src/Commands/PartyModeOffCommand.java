package Commands;

public class PartyModeOffCommand implements Command{
    AllLightsOffCommand allLightsOffCommand;
    StereoOffCommand stereoOffCommand;

    public PartyModeOffCommand(AllLightsOffCommand allLightsOffCommand, StereoOffCommand stereoOffCommand) {
        this.allLightsOffCommand = allLightsOffCommand;
        this.stereoOffCommand = stereoOffCommand;
    }

    public void execute() {
        allLightsOffCommand.execute();
        stereoOffCommand.execute();
    }
}
