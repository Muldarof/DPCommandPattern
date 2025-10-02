import Commands.*;
import Objects.CeilingFan;
import Objects.GarageDoor;
import Objects.Light;
//Have to use Java.Time because Java doesnt have an in-built time storage solution

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

        //Stage 2
        //Objects
        Light LivingRoomLight = new Light();
        Light KitchenLight = new Light();
        CeilingFan LivingRoomCeilingFan = new CeilingFan();
        GarageDoor GarageDoor = new GarageDoor();


        //Commands
        LightOnCommand LivingRoomLightOnCommand = new LightOnCommand(LivingRoomLight);
        LightOffCommand LivingRoomLightOffCommand = new LightOffCommand(LivingRoomLight);
        LightOnCommand KitchenLightOnCommand = new LightOnCommand(KitchenLight);
        LightOffCommand KitchenLightOffCommand = new LightOffCommand(KitchenLight);
        CeilingFanOnCommand LivingRoomCeilingFanOnCommand = new CeilingFanOnCommand(LivingRoomCeilingFan);
        CeilingFanOffCommand LivingRoomCeilingFanOffCommand = new CeilingFanOffCommand(LivingRoomCeilingFan);
        GarageDoorUpCommand GarageDoorUpCommand = new GarageDoorUpCommand(GarageDoor);
        GarageDoorDownCommand GarageDoorDownCommand = new GarageDoorDownCommand(GarageDoor);

        //Remote
        RemoteControl remoteControl = new RemoteControl();

        //Programmable Slots
        remoteControl.setCommand(0,LivingRoomLightOnCommand,LivingRoomLightOffCommand);
        remoteControl.setCommand(1, KitchenLightOnCommand,KitchenLightOffCommand);
        remoteControl.setCommand(2, LivingRoomCeilingFanOnCommand, LivingRoomCeilingFanOffCommand);
        remoteControl.setCommand(3,GarageDoorUpCommand, GarageDoorDownCommand);

    }
}
