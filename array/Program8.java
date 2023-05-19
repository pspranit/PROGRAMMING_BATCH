package array;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {

        int []arr=RandomArray.randomArr(10);

        for (int a:arr)
        {
            System.out.print(a+" ");
        }
        int n=new Scanner(System.in).nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n)
            {
                System.out.println("INDEX :"+i);
            }
        }
    }
}
