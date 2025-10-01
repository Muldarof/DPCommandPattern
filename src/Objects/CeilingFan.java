package Objects;

public class CeilingFan {
    FanSpeed fanSpeed;

    public CeilingFan() {
        fanSpeed = FanSpeed.OFF;
    }

    public void high(){
        System.out.println("Ceiling Fan On High");
        fanSpeed = FanSpeed.HIGH;
    }
    public void medium(){
        System.out.println("Ceiling Fan On Medium");
        fanSpeed = FanSpeed.MEDIUM;
    }
    public void low(){
        System.out.println("Ceiling Fan On Low");
        fanSpeed = FanSpeed.LOW;
    }
    public void off(){
        System.out.println("Ceiling Fan Off");
        fanSpeed = FanSpeed.OFF;
    }
    public String getSpeed(){
        return fanSpeed.toString();
    }


}
