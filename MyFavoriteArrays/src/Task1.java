import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    static int[] evenArray = new int[10];

    public static void main(String[] args) {
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 == 0) {
                System.out.print(evenArray[i] + " ");
            }
        }

    }
}
