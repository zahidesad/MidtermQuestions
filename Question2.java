package MidtermQuestions;

/**
 *
 * @author zahid
 */
public class Question2 {

    public static void main(String[] args) {
        //Convert the following for loop into while loop :
//        int m = 1;
//        for (int i = 1; i < 10; i += 2) {
//            if (i >> 3 == 0) {
//                m = m + i;
//            }
//        }

        int m = 1;
        int i = 1;
        while (i < 10) {
            if (i >> 3 == 0) {
                m = m + i;
            }
            i += 2;
        }

    }
}
