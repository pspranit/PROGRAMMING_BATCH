package numberSeries;

public class StrongNoCount {
    public static void main(String[] args) {

        for (int j = 1; j <= 100000; j++) {
            int a=j;
            int sum=0;
            while(a!=0)
            {
                int r = a % 10;
                int fact = 1;
                for (int i = 1; i <=r; i++)
                {
                    fact = fact * i;
                }
                sum =sum + fact;
                a = a / 10;
            }
            if(sum==j) {
                System.out.println("Strong Number :"+sum);
            }
        }
    }
}

