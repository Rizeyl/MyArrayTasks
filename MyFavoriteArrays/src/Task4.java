import java.util.Random;

public class Task4 {

    static int[] myArray3 = new int[10];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = (random.nextInt(40) - 20);
            System.out.println(myArray3[i]);
        }

        int posNumber = 0;
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] > 0) {
                posNumber = myArray3[i];
                break;
            }
        }

        System.out.println("Первое число " + posNumber);

    }
}
