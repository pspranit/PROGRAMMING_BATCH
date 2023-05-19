package angularMind;

public class Question7 {
    public static void main(String[] args) {

        int line=6;
        int star=6;
        int no1=1;

        for (int i = 0; i < line; i++)
        {
            int no2=no1;
            for (int j = 0; j < star; j++)
            {
                if(j==0||i==5||j==5||i==0)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print(no2+++" ");
                }
            }
            System.out.println();
        }
    }
}
