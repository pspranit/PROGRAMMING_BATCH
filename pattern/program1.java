
//* * * * * *
//* * * * * *
//* * * * * *
//* * * * * *
//* * * * * *

/////////////////////////////////////////////////////////////////////////////////
package pattern.pattern;

import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER ROWS");
        int row=sc.nextInt();

        System.out.println("ENTER COLUMN");
        int col=sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


//        int row=5;
//        int col=5;
//
//        for(int i=1;i<=row;i++)
//        {
//            for(int j=1;j<=col;j++)
//            {
//                if(i==1||j==5||i==5||j==1||i==2||i==3||i==4)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
}



