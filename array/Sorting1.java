package pattern.array;

public class Sorting1 {
    public static void main(String[] args) {
        int arr[]= array.RandomArray.randomArr(10);
        System.out.println("ORIGNAL ARRAY");
        for(int b:arr)
        {
            System.out.print(b+" ");
        }

        for (int i = 1; i <arr.length ; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
        System.out.println();

        System.out.println("SORTED ARRAY");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
