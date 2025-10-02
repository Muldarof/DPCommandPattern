package Commands;

import Objects.CeilingLight;
import Objects.GarageDoor;
import Objects.Light;

public class AllLightsOffCommand implements Command{
    CeilingLight ceilingLight;
    Light gardenLight;
    Light kitchenLight;
    GarageDoor garageLight;

    public AllLightsOffCommand(CeilingLight ceilingLight, Light gardenLight, Light kitchenLight, GarageDoor garageLight) {
        this.ceilingLight = ceilingLight;
        this.gardenLight = gardenLight;
        this.kitchenLight = kitchenLight;
        this.garageLight = garageLight;
    }

    public void execute() {
        ceilingLight.off();
        gardenLight.off();
        kitchenLight.off();
        garageLight.lightOff();
    }
}
