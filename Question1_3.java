package MidtermQuestions;

/**
 *
 * @author zahid
 */
public class Question1_3 {
    public static void main(String[] args) {
        //Sum the multiplies of 5 (5,10,15…) between 100 and 200.
        
        int sum = 0;
        
        for (int i = 100; i <= 200; i++) {
            if (i%5==0) {
                sum+=i;
            }
        }
        System.out.println("Sum of multiples of 5 between 100 and 200 : " + sum);
    }
}
