package day30_CustomClass;

public class Employees {

    public String name;
    public int ID;
    public char gender;
    public String jobtitle;
    public int salary;
    public boolean isFullTime;

    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, int ID, char gender, String jobtitle, int salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }
}
