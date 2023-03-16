package MidtermQuestions;

import java.util.Scanner;

/**
 *
 * @author zahid
 */
public class Question1_4 {

    public static void main(String[] args) {
        // Read 10 numbers from user and compute the average of these numbers. 

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 number");
        int num = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". number = ");
            num += input.nextInt();
        }

        double average = num / 10;

        System.out.println("Average of 10 numbers you entered : " + average);
    }
}
