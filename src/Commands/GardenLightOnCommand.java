package Commands;

import Objects.Light;

public class GardenLightOnCommand implements Command{
    Light gardenLight;

    public GardenLightOnCommand(Light gardenLight) {
        this.gardenLight = gardenLight;
    }

    public void execute() {
        gardenLight.on();
    }
}
