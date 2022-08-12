import java.util.Random;

public class Task4 extends Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = (random.nextInt(40) - 20);
            System.out.println(evenArray[i]);

        }

        int posNumber = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] > 0) {

                posNumber = evenArray[i];
                break;
            }

        }
        System.out.println("Первое число " + posNumber);

    }

}
