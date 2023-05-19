package pattern;

public class Program28 {
    public static void main(String[] args) {

//        int row=5;
//        int col=1;
//
//        for (int i=1;i<=row;i++)
//        {
//            for (int j=1;j<=col;j++)
//            {
//                System.out.print(" * ");
//            }
//            System.out.println();
//            col++;
//        }
//////////////////////////////////////////////////////////////////////////////
        int row=5;
        int col=1;

        for (int i=1;i<=row;i++)
        {
            int no=1;
            for (int j=1;j<=col;j++)
            {
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
            col++;
        }
    }
}
