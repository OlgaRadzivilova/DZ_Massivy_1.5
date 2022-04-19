import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1, 2, 3

        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        for (int f = 0; f < first.length; f++) {
            if (f != 0) {
                System.out.print(", ");
            }
            System.out.print(first[f]);

        }

        System.out.println();
        for (int i = first.length - 1; i >= 0; i--) {
            if (i != first.length - 1) {
                System.out.print(", ");
            }
            System.out.print(first[i]);
        }


        System.out.println();
        double[] second = {1.57, 7.654, 9.986};

        for (int s = 0; s < second.length; s++) {
            if (s != 0) {
                System.out.print(", ");
            }
            System.out.print(second[s]);
        }

        System.out.println();
        for (int s = second.length - 1; s >= 0; s--) {
            if (s != second.length - 1) {
                System.out.print(", ");
            }
            System.out.print(second[s]);
        }

        System.out.println();
        char[] third = {84, 104, 105, 114, 100};
        for (int t = 0; t < third.length; t++) {
            if (t != 0) {
                System.out.print(", ");
            }
            System.out.print(third[t]);
        }

        System.out.println();
        for (int t = third.length - 1; t >= 0; t--) {
            if (t != third.length - 1) {
                System.out.print(", ");
            }
            System.out.print(third[t]);
        }


        // Задание 4


        System.out.println();
        for (int f = 0; f < first.length; f++) {
            if ((first[f] + 1) % 2 == 0) {
                first[f] = first[f] + 1;
            }
            if (f != 0) {
                System.out.print(", ");
            }
            System.out.print(first[f]);
        }
    }
}



