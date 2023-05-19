package assignment_pattern;

public class ProgramNo74 {
    public static void main(String[] args) {

        int line = 5;
        int star = 1;
        int space = line - 1;
        char ch1 = 'A';


        for (int i = 0; i < line; i++)
        {
            char ch2 = ch1;
            for (int s = 0; s < space; s++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++)
            {
                if (j >= i)
                {
                    System.out.print(ch2--);
                } else {
                    System.out.print(ch2++);
                }
            }
            System.out.println();
            star += 2;
            space--;
        }
    }
}
