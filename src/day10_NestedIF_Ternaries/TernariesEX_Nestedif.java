package day10_NestedIF_Ternaries;

public class TernariesEX_Nestedif {

    public static void main(String[] args) {

        int score = 85;

        String result = (score>=0 && score<=100)? (score>=60)? "Passed" : "Failed" : "Invalid Score";
    }
}
