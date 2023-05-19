package numberSeries;

public class SpyNumber {
    public static void main(String[] args) {

//        int a=21221;
//        int sum=0;
//        int mul=1;
//
//        while(a!=0)
//        {
//            int r=a%10;
//            sum=sum+r;
//            mul=mul*r;
//            a=a/10;
//        }
//        if(sum==mul)
//        {
//            System.out.println("SPY NUMBER");
//        }

        //SPY NUMBER BETWENN 1 TO 100000
        for (int i = 1; i <= 10000; i++) {

            int a = i;
            int sum = 0;
            int mul = 1;

            while (a != 0) {
                int r = a % 10;
                sum = sum + r;
                mul = mul * r;
                a = a / 10;
            }
            if (sum == mul) {
                System.out.println(i);
            }
        }
    }
}
