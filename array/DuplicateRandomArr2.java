package array;

public class DuplicateRandomArr2 {
    public static void main(String[] args) {

        int[] arr = RandomArray.randomArr(10);

        for (int a : arr) {
            System.out.print(a + " ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]==arr[i] && i!=j)
                {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
