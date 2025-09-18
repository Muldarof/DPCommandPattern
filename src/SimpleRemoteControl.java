public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(Command command){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
