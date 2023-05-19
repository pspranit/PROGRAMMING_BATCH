package angularMind;

public class Question4 {
    public static void main(String[] args) {

        int line=5;
        int no1=1;

        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < line; j++)
            {
                System.out.print(no1++);
                if(no1>line)
                {
                    no1=1;
                }
            }
            System.out.println();
            no1++;
        }
    }
}
