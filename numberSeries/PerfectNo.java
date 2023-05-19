package numberSeries;

public class PerfectNo {
    public static void main(String[] args)
    {
        int a=4;
        int sum=0;

        for (int i = 1; i <a; i++)
        {
            if (a % i == 0)
            {
                sum = sum + i;
            }
        }

            if(sum==a)
            {
                System.out.println(a+" IS A PERFECT NUMBER");
            }
            else {
                System.out.println("NOT A PERFECT NUMBER");
            }
        }
    }

