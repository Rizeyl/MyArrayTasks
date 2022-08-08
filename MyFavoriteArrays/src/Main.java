import java.sql.Array;

public class Main {
static int [] myArray = new int [10];


    public static void main(String[] args) {

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = (int) (Math.random() * 20);
            System.out.println(myArray[i]);


        }
    }

}
