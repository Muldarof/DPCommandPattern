import Commands.*;
import Objects.*;
//Have to use Java.Time because Java doesn't have an in-built time storage solution

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
        Stereo  Stereo = new Stereo();
        Light GardenLight = new Light();
        CeilingLight ceilingLight = new CeilingLight();
        Television tv = new Television();
        Hottub hottub = new Hottub();

        //Commands
        LightOnCommand LivingRoomLightOnCommand = new LightOnCommand(LivingRoomLight);
        LightOffCommand LivingRoomLightOffCommand = new LightOffCommand(LivingRoomLight);
        LightOnCommand KitchenLightOnCommand = new LightOnCommand(KitchenLight);
        LightOffCommand KitchenLightOffCommand = new LightOffCommand(KitchenLight);
        CeilingFanOnCommand LivingRoomCeilingFanOnCommand = new CeilingFanOnCommand(LivingRoomCeilingFan);
        CeilingFanOffCommand LivingRoomCeilingFanOffCommand = new CeilingFanOffCommand(LivingRoomCeilingFan);
        GarageDoorUpCommand GarageDoorUpCommand = new GarageDoorUpCommand(GarageDoor);
        GarageDoorDownCommand GarageDoorDownCommand = new GarageDoorDownCommand(GarageDoor);
        StereoOnWithCDCommand StereoOnWithCDCommand = new StereoOnWithCDCommand(Stereo);
        StereoOffCommand StereoOffCommand = new StereoOffCommand(Stereo);
        LightOnCommand gardenLightOnCommand = new LightOnCommand(GardenLight);
        LightOffCommand gardenLightOffCommand = new LightOffCommand(GardenLight);
        CeilingLightOnCommand ceilingLightOnCommand = new CeilingLightOnCommand(ceilingLight);
        CeilingLightOffCommand ceilingLightOffCommand = new CeilingLightOffCommand(ceilingLight);
        TelevisionOnCommand tvOnCommand = new TelevisionOnCommand(tv);
        TelevisionOffCommand tvOffCommand = new TelevisionOffCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] allLightsOn = {LivingRoomLightOnCommand, KitchenLightOnCommand, ceilingLightOnCommand, gardenLightOnCommand};
        Command[] allLightsOff = {LivingRoomLightOffCommand, KitchenLightOffCommand, ceilingLightOffCommand, gardenLightOffCommand};
        MacroCommands allLightsOnMacro = new MacroCommands(allLightsOn);
        MacroCommands allLightsOffMacro = new MacroCommands(allLightsOff);

        Command[] partyOn = {LivingRoomLightOnCommand, tvOnCommand, StereoOnWithCDCommand, hottubOnCommand};
        Command[] partyOff = {LivingRoomLightOffCommand, tvOffCommand, StereoOffCommand, hottubOffCommand};
        MacroCommands partyOnMacroCommand = new MacroCommands(partyOn);
        MacroCommands partyOffMacroCommand = new MacroCommands(partyOff);


        //Remote
        RemoteControl remoteControl = new RemoteControl();

        //Programmable Slots
        remoteControl.setCommand(0, LivingRoomLightOnCommand,LivingRoomLightOffCommand);
        remoteControl.setCommand(1, KitchenLightOnCommand,KitchenLightOffCommand);
        remoteControl.setCommand(2, LivingRoomCeilingFanOnCommand, LivingRoomCeilingFanOffCommand);
        remoteControl.setCommand(3, GarageDoorUpCommand, GarageDoorDownCommand);
        remoteControl.setCommand(4, StereoOnWithCDCommand, StereoOffCommand);
        remoteControl.setCommand(5, allLightsOnMacro, allLightsOffMacro);
        remoteControl.setCommand(6, partyOnMacroCommand, partyOffMacroCommand);

    }
}
