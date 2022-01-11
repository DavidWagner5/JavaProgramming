package day35_OOPEncapsulation;
/*1. Create an Employee Class:
            private variables:
                name, gender, age, salary

            Encapsulate all the private fields

                1. Name can not be empty
                2. gender can not anything other than female or male
                3. age can not be zero , negative or greater than 150
                4. salary can not be zero or negative */
public class Employee {

    private String name;
    private char gender;
    private int age;
    private int salary;

    //--------------------------------------set now-----------------------------

    public void setName(String name) {
        if (name.equals("")){
            System.err.println("Invalid name!");
            System.exit(0);
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if (gender!='F'||gender!='M'){
            System.err.println("Invalid gender!");
            System.exit(0);
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age<16||age>90){
            System.err.println("Invalid age!");
            System.exit(0);
        }
        this.age = age;
    }

    public void setSalary(int salary) {
        if (salary<=0){
            System.err.println("Invalid salary!");
            System.exit(0);
        }
        this.salary = salary;
    }
    //-------------------------method----------------------

    public String displayName(){
        return (name+"i love chicken and rice");
    }

    //-----------------------------get now---------------------------


    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setAge(30);
        employee1.setName("David");

        System.out.println(employee1.getAge());
        System.out.println(employee1.getName());

        String love = employee1.displayName();
        System.out.println(love);

    }


}
