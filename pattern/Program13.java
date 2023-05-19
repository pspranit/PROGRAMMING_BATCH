
//        ** **
//        ** **
//          *
//        ** **
//        ** **

package pattern;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ROWS");
        int row = sc.nextInt();

        System.out.println("ENTER COLUMN");
        int col = sc.nextInt();

         int count=1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
//                if (i == 1 || i == 2 | i == 3 || i == 4 || i == 5) {
//                    System.out.print(i + " ");
//                }
                System.out.print(count + " ");
            }
            System.out.println();
            count++;
        }
    }
}





