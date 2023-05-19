package numberSeries;

public class Palindrome2 {
    public static void main(String[] args) {

        int sum1=0,temp1=0;
        for (int i = 10; i <= 10000; i++) {
            int a = i;
            int sum = 0;
            int temp = a;

            while (a != 0) {
                int r = a % 10;
                sum = sum * 10 + r;
                a = a / 10;
            }
            if (temp == sum) {
                System.out.println(sum+" ");
            }
        }
    }
}
