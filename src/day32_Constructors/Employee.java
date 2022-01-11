package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    //overloading the constructor
    //constructor can only be called by this keyword
    //only a constructor can call another constructor
    //constructor call must be at the first step
    //constructor can only call one other one
    //constructor cant call or contain itself
    public Employee(String name) {
        this.name = name;

    }

    public Employee(String name, char gender) {
       this(name);
       this.gender = gender;

    }

    public Employee(String name, char gender, String jobTitle) {
       this(name, gender);
       this.jobTitle = jobTitle;

    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }
}
