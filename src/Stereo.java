public class Stereo {
    public Stereo() {
    }

    public void on(){
        System.out.println("Stereo On");
    }
    public void off(){
        System.out.println("Stereo Off");
    }
    public void setCd(){
        System.out.println("CD Player Active");
    }
    public void setDvd(){
        System.out.println("DVD Player Active");
    }
    public void setRadio(){
        System.out.println("Radio Active");
    }
    public void setVolume(int volume){
        System.out.println("Set Volume to " + volume);
    }


}
