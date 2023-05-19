package sorting;



public class Program1 {
    public static void main(String[] args) {

        int brr[]={58,32,66,22,10};

        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr.length -1-i; j++) {
                if (brr[j] > brr[j + 1]) {
                    int temp = brr[j];
                    brr[j] = brr[j + 1];
                    brr[j + 1] = temp;
                }
            }
        }
        for (int p : brr) {
            System.out.print(p + " ");
        }
    }
}
