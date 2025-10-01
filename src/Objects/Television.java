package Objects;

public class Television {

    public Television() {
    }

    public void on(){
        System.out.println("TV On");
    }
    public void off(){
        System.out.println("TV Off");
    }
    public void setInputChannel(int channel){
        System.out.println("Set Channel to " + channel);
    }
    public void setVolume(int volume){
        System.out.println("Set Volume to " + volume);
    }
}
