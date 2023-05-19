package pattern;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER ROWS");
        int row=sc.nextInt();

        System.out.println("ENTER COLUMN");
        int col=sc.nextInt();

       for (int i=row;i>=1;i--)
       {
           for (int j=col;j>=1;j--)
           {
                   System.out.print(i+""+j+" ");
               }
           System.out.println();
           }

       }

    }

//11 12 13 14 15
//21 22 23 24 25
//31 32 33 34 35
//41 42 43 44 45
//51 52 53 54 55
