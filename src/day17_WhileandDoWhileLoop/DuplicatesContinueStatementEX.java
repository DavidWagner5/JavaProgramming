package day17_WhileandDoWhileLoop;

public class DuplicatesContinueStatementEX {
    public static void main(String[] args) {

        String str = "AAABBCC";
        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            String ch = "" + str.charAt(i);
            if(result.contains(ch)){  //if the result already containsthat character, it skips it
                continue;

            }

            result +=ch;

        }
        System.out.println(result);

    }
}
