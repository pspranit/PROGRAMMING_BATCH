package pattern;


public class Program23 {
    public static void main(String[] args) {

        int line=5;
        int star=1;
        int space=line-1;

        for(int i=1;i<=line;i++)
        {
            int ch=1;
            for (int k = 0; k < space; k++)
            {
                System.out.print(" _ ");
            }

            for (int j=0;j<star;j++)
            {
                System.out.print(" "+ch++ +" ");
            }
            System.out.println();
            space--;
            star++;


        }

    }
}







