package PracticeTasks.AppTask;
/*/*
            appTask:


        Create a class called MobileApp

            instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)
*/
public class MobileApp {

    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MobileApp(String name, String version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
