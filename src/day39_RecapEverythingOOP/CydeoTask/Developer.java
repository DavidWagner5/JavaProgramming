package day39_RecapEverythingOOP.CydeoTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeID, String jobTitle, int salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBug(){
        System.out.println(getJobTitle()+ " " + getName() + " is fixing bug");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " " + getName()+ " is developing the application");
    }
}
