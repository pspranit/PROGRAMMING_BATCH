package array;

public class Program5 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};

        int count=arr.length/2;

        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
            count++;
        }
        for(int a:arr)
        {
            System.out.print(a+"  ");
        }
    }
}
