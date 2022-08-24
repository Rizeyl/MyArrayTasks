public class Task3  {

    static int[] myArray2 = new int[10];

    public static void main(String[] args) {

        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = (int) (Math.random() * 20);
            System.out.println(myArray2[i]);
        }

        int sum = 0;
        int sumMult = 1;

        for (int i = 0; i < myArray2.length; i++) {
            sum += myArray2[i];
            sumMult *= myArray2[i];
        }

        System.out.println("Сумма всех чисел " + sum + "\n" + "Произведение всех числе " + sumMult);

    }
}
