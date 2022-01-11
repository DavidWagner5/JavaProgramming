package day03_EscapeSequences;

import java.sql.SQLOutput;

/*
escape sequence form:must be given with double quotes
  \n
  \t is another escape sequence, you can just use tab after quotes instead. It's tab
  \"
  \\
  \'
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java\nPython\nC#");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("--------------------------------");

        System.out.println("    Java is a cool programming language");

        System.out.println("---------------------------------");

        System.out.println("/ \\"); //in order to give one forward slash, we need to give two because it wants a sequence if one.

        System.out.println("------------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); //in order to print a quote within code, you must provide two sets of them.
    }
}
