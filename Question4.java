package MidtermQuestions;

import java.util.Scanner;

/**
 *
 * @author zahid
 */
public class Question4 {

    public static void main(String[] args) {
//        Using switch statement and for loops (Do not use if statements), write a java program to ask the user to enter a
//        string, and then according to the length of the string the program will do the following:
//        - If the string length = 1, then print this string 10 times.
//        - If the string length = 2, then print this string 5 times.
//        - If the string length = 3, then print this string 3 times.
//        - If the string length = 4 or 5, then print this string 2 times.
//        - Any other length, print “The length of string is more than 5” 

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string : ");
        String string = input.next();
        

        switch (string.length()) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    System.out.println(string);
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    System.out.println(string);
                }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    System.out.println(string);
                }
                break;
            case 4,5:
                for (int i = 0; i < 2; i++) {
                    System.out.println(string);
                }
                break;
            default:
                System.out.println("The length of string is more than 5");

        }
    }
}
