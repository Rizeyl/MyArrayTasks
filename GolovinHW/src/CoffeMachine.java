import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        System.out.println("Кофе-машина");

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите сумму:");

        int moneyAmount = scanner.nextInt();

        int[] drinkPrices = {200, 100, 50, 75, 500};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

        boolean canBuyAnything = false;

        int length = Math.min(drinkPrices.length, drinkNames.length);

        for (int i = 0; i < length; i = i + 1) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " +
                        drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if (!canBuyAnything) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }
    }
}
