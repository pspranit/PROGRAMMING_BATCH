
//        ** **
//        ** **
//          *
//        ** **
//        ** **

package pattern;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ROWS");
        int row = sc.nextInt();

        System.out.println("ENTER COLUMN");
        int col = sc.nextInt();

        int ch1=1;

        for(int i=1;i<=row;i++)
        {
            int ch2=1;
            for(int j=1;j<=col;j++)
            {
                System.out.print(" "+ch2++ * ch1+" ");
            }
            System.out.println();
            ch1++;
        }

    }
}





