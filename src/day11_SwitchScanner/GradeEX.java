package day11_SwitchScanner;

public class GradeEX {
    public static void main(String[] args) {
        char ch = 'A';
        String result = "";

        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";
        }
        System.out.println(result);

    }

    }


