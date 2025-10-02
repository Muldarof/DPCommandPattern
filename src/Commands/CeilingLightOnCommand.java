package Commands;

import Objects.CeilingLight;

public class CeilingLightOnCommand implements Command{
    CeilingLight ceilingLight;

    public CeilingLightOnCommand(CeilingLight ceilingLight) {
        this.ceilingLight = ceilingLight;
    }

    public void execute() {
        ceilingLight.on();
    }
}
