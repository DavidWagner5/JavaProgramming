package day39_RecapEverythingOOP.DeviceTask;

public class MyDevices {



    public static void main(String[] args) {
        Computer comp = new Computer("Mac", "Air", 1000, true, true);

        comp.turnoff();

        comp.restore();


        Nokia nokia = new Nokia("model1", 200, true, true);



        System.out.println(nokia);





    }
}
