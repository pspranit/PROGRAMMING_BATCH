package HashSet;

import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {

        String str1="army";
        String str2="mary";

       int n1=str1.length();
       int n2=str2.length();

       if(n1==n2)
       {
           char[] arr =str1.toCharArray();
           char []brr=str2.toCharArray();

           Arrays.sort(arr);
           Arrays.sort(brr);

           boolean status=true;

           for (int i = 0; i < n1; i++) {
               if(arr[i]!=brr[i])
               {
                   status=false;
               }
           }
           if(status)
           {
               System.out.println("STRING IS ANAGRAM");
           }
           else {
               System.out.println("STRING IS NOT ANAGRAM");
           }
       }
    }
}

