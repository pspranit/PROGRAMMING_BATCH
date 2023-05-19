package pattern.numberSeries;

public class PerfectNoCount {
    public static void main(String[] args) {
        for (int j = 1; j < 10000; j++) {
        int a=j;
        int sum=0;

        for (int i = 1; i < a; i++) {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==a)
        {
            System.out.println("PERFECT NO :"+sum);
        }

    }
    }
}
