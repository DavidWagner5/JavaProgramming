package day39_RecapEverythingOOP.CydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private int salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<=0){
            System.err.println("Invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working");
    }

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, int salary) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                "name=" + getName()+
                "age=" + getAge() +
                "gender=" + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
