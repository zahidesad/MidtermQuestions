package MidtermQuestions;

import java.util.Scanner;

/**
 *
 * @author zahid
 */
public class Question3 {

    public static void main(String[] args) {
    //Write a program that asks the user to enter an integer number then it will test if it is positive or negative. If it is
    //negative, it will show a message that it is negative and no other action will be done. If it is positive, the
    //program will test it this number is divided by 2, 3, 4, and 5. (Use if and if else statements)

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer number : ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("It is negative, Thank you.");
        } else if (number > 0) {
            for (int i = 2; i <= 5; i++) {
                if (number % i == 0) {
                    System.out.println(number + "is divisible by " + i + " ");

                }

            }
        }
    }
}
