package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourly rate
        //weekly hours


        int HourlyRate = 65;
        int WeeklyHours = 45;
        int NumberOfWeeks = 54;
        int Salary = HourlyRate * WeeklyHours * NumberOfWeeks;

        System.out.println(Salary);

        System.out.println("HourlyRate = $" + HourlyRate);
        System.out.println("WeeklyHours = " + WeeklyHours);
        System.out.println("NumberOfWeeks = " + NumberOfWeeks);
        System.out.println("Salary = $" + Salary);

    //you can include "$" right before the double quote to label dollar sign

    }






}
