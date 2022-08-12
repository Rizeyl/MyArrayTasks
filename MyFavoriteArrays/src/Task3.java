public class Task3 extends Task1 {
    public static void main(String[] args) {

        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = (int) (Math.random() * 20);
            System.out.println(evenArray[i]);
        }
        int sum = 0;
        Integer sumMult = 1;
        for (int i = 0; i < evenArray.length; i++) {
            sum += evenArray[i];
            sumMult *= evenArray[i];
        }
        System.out.println("Сумма всех чисел " + sum + "\n" + "Произведение всех числе " + sumMult);

    }
}
