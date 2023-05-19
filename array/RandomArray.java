package array;

import java.util.Random;

//class Logic
//{
//     int[] randomArr(int n)
//    {
//        Random r=new Random();
//        int [] arr=new int[n];
//
//        for (int i = 0; i < n; i++)
//        {
//            arr[i]=r.nextInt(100);
//
//        }
//        return arr;
//    }
//}
//
//public class RandomArray
//{
//    public static void main(String[] args)
//    {
//        Logic l1=new Logic();
//
//        int [] arr=l1.randomArr(3);
//        for (int a:arr)
//        {
//            System.out.print(a+"  ");
//        }
//    }
//}


public class RandomArray {
    public static Random rd = new Random();

   public static int[] randomArr(int n) {
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(20);

        }
        return arr;
    }
}
