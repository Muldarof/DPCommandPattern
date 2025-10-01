package Objects;

public class Hottub {
    float temp;

    public Hottub() {
        temp = 0;
    }

    public void setTemperature(float temp) {
        this.temp = temp;
        System.out.println("Setting Temperature to: " + temp);
    }
    public void circulate(){
        System.out.println("Circulating Water");
    }
    public void jetsOn(){
        System.out.println("Jets On");
    }
    public void jetsOff(){
        System.out.println("Jets Off");
    }
}
