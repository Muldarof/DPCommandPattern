package Commands;

import Objects.Light;

public class GardenLightOffCommand implements Command{
    Light gardenLight;

    public GardenLightOffCommand(Light gardenLight) {
        this.gardenLight = gardenLight;
    }

    public void execute() {
        gardenLight.off();
    }
}
