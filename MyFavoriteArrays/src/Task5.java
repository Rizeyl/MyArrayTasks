import java.util.Random;

public class Task5 extends Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = (random.nextInt(40) - 20);
            System.out.println(evenArray[i]);

        }

        int counter = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] > 0) {
                counter++;
            }
        }
        System.out.println("Положительных чисел " + counter);

    }
}

