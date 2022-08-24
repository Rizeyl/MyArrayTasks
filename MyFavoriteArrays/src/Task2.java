

public class Task2 {

    static int[] evenArray2 = new int[10];

    public static void main(String[] args) {
        for (int i = 0; i < evenArray2.length; i++) {
            evenArray2[i] = (int) (Math.random() * 10);
            System.out.println(evenArray2[i]);
        }

        int counter = 0;
        int sum = 0;

        for (int i = 0; i < evenArray2.length; i++) {
            if (evenArray2[i] % 2 == 0) {
                sum = sum + evenArray2[i];
                counter++;
            }
        }

        System.out.println("Сумма чётных чисел " + sum + "\n" + "Кол-во чётных чисел " + counter);

    }
}
