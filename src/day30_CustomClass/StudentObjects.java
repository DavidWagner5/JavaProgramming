package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("David", 'M', 24, 114572, 'A');


        Student student2 = new Student();
        student2.setInfo("Natalia", 'F', 23, 666666, 'B');


        Student student3 = new Student();
        student3.setInfo("Elminur" , 'F', 26, 667766, 'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M',28,5511,'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');

        Student [] students = {student1, student2, student3, student4, student5};

        for (Student each : students) {
            System.out.println(each);

        }


        ArrayList<Student> earlybirds = new ArrayList<>();
        ArrayList<Student> angrybirds = new ArrayList<>();


        for (Student each : students) {
            if(each.grade=='A'){
                earlybirds.add(each);
            }else{
                angrybirds.add(each);
            }

        }
        System.out.println("earlybirds = " + earlybirds);
        System.out.println("angrybirds = " + angrybirds);



    }
}
