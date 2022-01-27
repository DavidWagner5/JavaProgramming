package PracticeTasks.AppTask;

public class Discord extends MobileApp{
    String someone;

    public Discord( String version) {
        super("Discord", version);
    }

    public void chat(String someone){
        System.out.println("chatting on discord with" + someone);
    }
}
