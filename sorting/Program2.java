package sorting;

public class Program2 {
    public static void main(String[] args) {

        char brr[]={'P','R','a','n','i','t'};

        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr.length -1-i; j++) {
                if (brr[j] > brr[j + 1]) {
                    char temp = brr[j];
                    brr[j] = brr[j + 1];
                    brr[j + 1] = temp;
                }
            }
        }
        System.out.print("SORTED CHARACTER IS: ");
        for (int p : brr) {
            System.out.print((char)p + " ");
        }
    }
}
