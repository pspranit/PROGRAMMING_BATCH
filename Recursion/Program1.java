package Recursion;

import java.util.Scanner;

public class Program1 {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        add(a);
    }

    static void add(int a)
    {
        if(a>=0)
        {
            System.out.println(sum);
            sum=sum+2;
            a--;
            add(a);
        }
    }
}
