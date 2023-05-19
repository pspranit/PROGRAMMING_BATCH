package pattern.numberSeries;

public class PrimeCount {
    public static void main(String[] args) {

        int totalCount = 0;
        for (int i = 1; i <= 100; i++)
        {
            int a = i;
            int count = 0;
            for (int j = 1; j <= a; j++)
            {
                if (a % j == 0)
                {
                    count++;
                }
            }
                    if (count == 2)
                    {
                        totalCount++;
                        System.out.println(i);
                    }
                }
                 System.out.println("TOTAL PRIME NUMBERS :" + totalCount);
            }
        }
