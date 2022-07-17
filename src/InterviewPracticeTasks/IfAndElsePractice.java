package InterviewPracticeTasks;
//2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
//            Ex:
//                number = 65;
//
//            output:
//                65 is divisible by 2: false
//                65 is divisible by 3: false
//                65 is divisible by 5: true
public class IfAndElsePractice {


        public static void main(String[] args) {


                int number = 12;

                if (number % 3 == 0) {
                        System.out.println("divisible");
                } else {
                        System.out.println("not divisible");
                }
        }
}


