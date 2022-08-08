public class Field {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final char SYMBOL_SEA = '~';
    public static final char SHIP_PART = 'O';
    public static final char SYMBOL_DAMAGE = 'X';
    public static final char SYMBOL_SEA_STRIKE = '*';
    public static void main(String[] args) {

        //Заполняем горизонтальную границу
        for (int i = 0; i <= 10; i++) {



                System.out.printf(ANSI_YELLOW + "[%d]", i);


        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.printf(ANSI_YELLOW + "[%c]", 'A' + i);

        }
        System.out.println();
    }
}
