package pattern.assignment_pattern;

public class Program20 {
    public static void main(String[] args) {

        int line=9;
        int star=5;
        int space=0;

        for(int i=0;i<line;i++)
        {
            for (int j=0;j<star;j++)
            {
                System.out.print("*");
            }
            for (int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            for (int j1=0;j1<star;j1++)
            {
                System.out.print("*");
            }
            if(i<4)
            {
                space+=2;
                star--;
            }
            else {      //else if(i>4)
                star++;
                space-=2;
            }
            System.out.println();
        }
    }
}
