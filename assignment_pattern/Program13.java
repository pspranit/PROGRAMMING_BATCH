package assignment_pattern;

public class Program13 {
    public static void main(String[] args) {

        int line=5;
        int star=5;
        int space=0;

        for (int i=0;i<line;i++)
        {
            for (int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<star;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            star--;
            space++;
        }
    }
}
