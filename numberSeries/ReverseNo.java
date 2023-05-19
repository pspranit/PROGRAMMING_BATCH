package numberSeries;

public class ReverseNo
{
    public static void main(String[] args)
    {
        int no=12345;
        int temp=0;

        while(no!=0)
        {
            temp=no%10;
            System.out.print(temp);
            no=no/10;
        }
    }
}

