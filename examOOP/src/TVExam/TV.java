package TVExam;

public class TV {
    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TV() {

    }

    public void turnOn() {
        this.on = true;
    }
    public void turnOff() {
        this.on = false;
    }
    public void setChannel(int newChannel) {
        if(on && newChannel <= 120 && newChannel >=1) {
            this.channel = newChannel;
        }
    }
    public void setVolume(int newVolume) {
        if(on && newVolume >=1 && newVolume <=7) {
            this.volume = newVolume;
        }
    }
    public void upChannel() {
        if(on && channel < 120) {
            channel++;
        }
    }
    public void downChannlel() {
        if(on  && channel >= 1) {
            channel--;
        }
    }
    public void upVolume() {
        if(on && volume <= 7) {
            this.volume++;
        }
    }
    public  void downVolume() {
        if(on && volume >=1) {
            this.volume--;
        }
    }

}