import java.util.Random;

public class Task5 {

    static int[] evenArray3 = new int[10];

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < evenArray3.length; i++) {
            evenArray3[i] = (random.nextInt(40) - 20);
            System.out.println(evenArray3[i]);
        }

        int counter = 0;

        for (int i = 0; i < evenArray3.length; i++) {
            if (evenArray3[i] > 0) {
                counter++;
            }
        }

        System.out.println("Положительных чисел " + counter);

    }
}

