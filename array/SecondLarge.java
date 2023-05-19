package pattern.array;

public class SecondLarge {
    public static void main(String[] args) {

        int arr[]= array.RandomArray.randomArr(9);
        for(int b:arr)
        {
            System.out.print(b+" ");
        }
        System.out.println();
        int size=arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(arr[size-2]);
    }
}
