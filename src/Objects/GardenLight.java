package Objects;

import java.time.LocalTime;

public class GardenLight {
    LocalTime duskTime;
    LocalTime dawnTime;

    public GardenLight() {
        duskTime = LocalTime.of(20,0,0);
        dawnTime = LocalTime.of(6,0,0);
    }

    public void setDuskTime(LocalTime time){
        duskTime = time;
        System.out.println("Setting Dusktime to: " + time);
    }
    public void setDawnTime(LocalTime time){
        dawnTime = time;
        System.out.println("Setting DawnTime to: " + time);
    }
    public void manualOn(){
        System.out.println("Garden Light On");
    }
    public void manualOff(){
        System.out.println("Garden Light Off");
    }

}
