public class Main {

    public static void main(String[] args) {
        int  result1 = compareTwoNumbers(69,71);
        System.out.println(result1);
        int result2 = compareThreeNumbers(127,225,112);
        System.out.println(result2);
        int result3 = sum(200, 1);

        System.out.println(result3);



    }


    public static int sum (int x, int t) {

        int tempSum = x;
        //System.out.printf("Итерация %d: sum = %d%n", 0, tempSum);
        int skokPribavim = 10;
        for (int i = 0; i < t; i ++) {
            tempSum += skokPribavim;
            skokPribavim += 10;
            System.out.printf("Итерация %d: sum = %d прибавили = %d%n", i + 1, tempSum, skokPribavim);
        }
        return tempSum;
    }

    public static int compareTwoNumbers(int a, int b) {
        return Math.max(a, b);
    }
    public static int compareThreeNumbers (int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (c>=a&&c>=b) {
            return c;
        } else  {
            return b;

        }

    }




}
