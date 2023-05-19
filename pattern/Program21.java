
//        ** **
//        ** **
//          *
//        ** **
//        ** **

package pattern;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ROWS");
        int row = sc.nextInt();

        System.out.println("ENTER COLUMN");
        int col = sc.nextInt();

        for(int i=1;i<=row;i++) {

            for (int j = 1; j <= col; j++)
            {
                    System.out.print(i+" ");

                    if(i==2||i==4)
                    {
                        System.out.print("*");
                }
            }
            System.out.println();
            }

        }
    }






