package array;

public class Program4 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        System.out.println("ARRAY LENGTH IS :"+arr.length);
        System.out.println(".......................");
        int count=arr.length-1;

        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
            count--;
        }
        System.out.print("{ ");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        System.out.println("}");

//        for (int i = arr.length-1; i >=0; i--) {
//            System.out.print(arr[i]+" ");
        }

    }

