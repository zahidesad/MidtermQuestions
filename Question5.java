package MidtermQuestions;

import java.util.Scanner;

/**
 *
 * @author zahid
 */
public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a height for your rectangle : ");
        int height = input.nextInt();

        System.out.print("Please enter a width for your rectangle : ");
        int width = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
