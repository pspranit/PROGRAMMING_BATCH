package array;

public class Program2 {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,10,12,14,16,18,20};
        int sum=0;

        for(int s:arr)
        {
             sum+=s;

        }
//
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//        }
        System.out.println("SUM OF ARRAY :"+sum);
        System.out.println("AVERAGE OF ARRAY :"+sum/arr.length);
    }

}
