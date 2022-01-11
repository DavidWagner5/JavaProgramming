package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

/*  1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary
    5. what's the maximum salary*/
//remove if name start with 'M'
public class EmployeesObject {
    public static void main(String[] args) {

        Employees employee1 = new Employees();
        employee1.setInfo("David", 114572, 'M', "SDET", 600000, false);

        Employees employee2 = new Employees();
        employee2.setInfo("Ben", 555555,'M', "Teacher", 30000, true);

        Employees employee3 = new Employees();
        employee3.setInfo("Wilford", 777777,'M', "Dummy", 30000, true);

        Employees employee4 = new Employees();
        employee4.setInfo("Maura", 666666,'F', "Hoe", 1, true);

        Employees employee5 = new Employees();
        employee5.setInfo("Zach", 333333,'F', "lol", 2, true);


        Employees [] employees = {employee1,employee2,employee3, employee4, employee5};

        int countFullTime = 0;
        int countParTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        ArrayList<Employees> AllEmployees = new ArrayList<>();
        AllEmployees.addAll(Arrays.asList(employee1, employee2, employee3, employee4,employee5));
        AllEmployees.removeIf(p -> p.name.startsWith("M"));

        System.out.println(AllEmployees);


        for (Employees each : employees) {
            if(each.isFullTime){
                countFullTime++;
            }else{
                countParTime++;
            }
            if(each.salary> max){
                max = each.salary;
            }
            if(each.salary<min){
                min = each.salary;
            }


        }


        System.out.println("countParTime = " + countParTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);










    }
}
