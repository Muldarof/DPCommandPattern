package Commands;

import Objects.CeilingLight;
import Objects.GarageDoor;
import Objects.Light;

public class AllLightsOnCommand implements Command{
    CeilingLight ceilingLight;
    Light gardenLight;
    Light kitchenLight;
    GarageDoor garageLight;

    public AllLightsOnCommand(CeilingLight ceilingLight, Light gardenLight, Light kitchenLight, GarageDoor garageLight) {
        this.ceilingLight = ceilingLight;
        this.gardenLight = gardenLight;
        this.kitchenLight = kitchenLight;
        this.garageLight = garageLight;
    }

    public void execute() {
        ceilingLight.on();
        gardenLight.on();
        kitchenLight.on();
        garageLight.lightOn();
    }
}
