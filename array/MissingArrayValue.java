package array;

public class MissingArrayValue {
    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,5};
        int p=arr.length;

        int sum=((p+1)*(p+2)/2);
        for(int a=0;a<arr.length;a++)
        {
            sum=sum-arr[a];
        }
        System.out.println("MISSING VALUE :"+sum);
    }
}

