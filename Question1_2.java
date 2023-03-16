package MidtermQuestions;

/**
 *
 * @author zahid
 */
public class Question1_2 {
    public static void main(String[] args) {
        //Print the even numbers between 10 and 200.
        
        for (int i = 10; i <= 200; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }

//Alternative Solution
//        for (int i = 10; i <= 200; i+=2) {
//            System.out.println(i);
//        }
    }
    
}
