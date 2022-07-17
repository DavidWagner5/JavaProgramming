package day43_OOPAbstraction.employeeTask;

public abstract class Employee extends Person{

    private final int id;
    private String JobTitle;
    private double salary;


    public Employee(String name, int age, char gender, int id, String JobTitle, double salary) {
        super(name, age, gender);
        if(id<=0){
            throw new RuntimeException("invalid id");
        }
       this.id = id;
       setJobTitle(JobTitle);
       setSalary(salary);
    }

    public abstract void work();


    public int getID() {
        return id;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name" + getName() +
                ", age=" + getAge() +
                ", gender" +getGender() +
                "ID=" + id +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
