package day24_CustomMethodReturnMethod;
//create a method that can remove duplicates from a string and returns a new value
public class ReturnMethod7 {
    public static void main(String[] args) {
        String str = "cccccccccccccccccdddddddddddddddaaaaaabbbbb";

        str = removeDuplicates(str);

        System.out.println(str);

    }

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(!(result.contains(""+each))){
                result += each;

            }

        }

        return result;
    }
}
