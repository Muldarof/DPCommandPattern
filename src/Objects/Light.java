package Objects;

public class Light {
    boolean status;

    public Light(){
        status = false;
    }

    public void on(){
        status = true;
        System.out.println("Light is On");
    }

    public void off(){
        status = false;
        System.out.println("Light is Off");
    }


}
