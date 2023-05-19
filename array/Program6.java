package array;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {5, 6, 7, 8,9};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr3 = new int[n1 + n2];
        int index=0;

        for (int a:arr1)
        {
            arr3[index]=a;
            index++;
        }
        for (int a:arr2)
        {
            arr3[index]=a;
            index++;
        }
       // System.out.println(Arrays.toString(arr3));

        for (int a:arr3)
        {
            System.out.print(a+"  ");
        }

    }

}
