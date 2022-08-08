public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; //л в минуту
        int devastationSpeed = 10; //л в минуту
        int full = 0;
        int count = 0;
        while (full != volume) {
            count ++;
            full += fillingSpeed - devastationSpeed;

            System.out.println(count + ". " + full);


        }
    }
}
