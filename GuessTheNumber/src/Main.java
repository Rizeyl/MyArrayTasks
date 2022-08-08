import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randNumber = (int) (Math.random() * (10 - 1)) + 1;
        String userEntry;
        int countTry = 1;

        System.out.println("Привет. Я загадал число от 1 до 10. Попробуй его угадать. Попытка № " + countTry + ":");

        do {
            Scanner scanner = new Scanner(System.in);
            userEntry = scanner.nextLine();

                int userNumber = Integer.parseInt(userEntry);

            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Вы ввели некорректное число, но все равно можете продолжить игру.");
            }
            if (userNumber > randNumber) {
                countTry++;
                System.out.println("Загаданное число меньше. Попытайтесь снова. Попытка №" + countTry + ":");

            }
            else if (userNumber < randNumber) {
                countTry++;
                System.out.println("Загаданное число больше. Попытайтесь снова. Попытка №" + countTry + ":");


            } else  {

                System.out.println("Вы угадали! Количество попыток " + countTry);
                break;
            }
        } while (true);


    }


}


