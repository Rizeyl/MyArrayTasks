import org.w3c.dom.ls.LSOutput;

public class UpAndDown {
    //    int coffee = 100;
//    int milk = 100;
//    boolean iWantCofeeToday = true;
    public static void main(String[] args) {

        boolean result = yes(oh(oh(true))) && yes(oh(true));
        System.out.println(result);
    }

    static boolean oh(boolean input) {
        System.out.print("oh ");
        return input;
    }

    static boolean yes(boolean notUsed) {
        System.out.print("yes ");
        return true;
    }
    static boolean no(boolean notUsed) {
        System.out.print("no ");
        return false;
    }

}
