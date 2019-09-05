package TVExam;
public class Main {
    public static void main(String[] args) {
        TV tivi1 = new TV();

        tivi1.turnOn();
        tivi1.setChannel(13);
        System.out.println(tivi1.channel);
        tivi1.upChannel();
        tivi1.upChannel();
        tivi1.upChannel();
        tivi1.upChannel();
        System.out.println(tivi1.channel);
        tivi1.upVolume();
        System.out.println(tivi1.volume);
    }
}
