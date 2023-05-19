package assignment_pattern;

public class Program8 {
    public static void main(String[] args) {

        int line =9;
        int star=1;
        int space=4;
        for (int i=0;i<line;i++)
        {
            for (int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<star;j++)
            {
                System.out.print("*");
            }
                if(i<4)
                {
                    space--;
                    star++;
                }
                else{
                    space++;
                    star--;
                }
            System.out.println();
        }
    }
}
