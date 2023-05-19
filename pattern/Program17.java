
//        ** **
//        ** **
//          *
//        ** **
//        ** **

package pattern;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ROWS");
        int row = sc.nextInt();

        System.out.println("ENTER COLUMN");
        int col = sc.nextInt();

        int ch=1;

        for(int i=1;i<=row;i++) {

            for (int j = 1; j <= col; j++) {
                System.out.print(ch++ +" ");
                if(ch>7)
                {
                    ch=1;
                }
            }
            System.out.println();
        }
    }
}





