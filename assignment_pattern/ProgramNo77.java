package assignment_pattern;

public class ProgramNo77 {
    public static void main(String[] args) {

        int row=5;
        //int column=1;
        for (int i=1;i<=row;i++)
        {
           int  x=i;
            for (int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x=x+row-j;

            }
            System.out.println();
            //column++;
        }
//
//        int row=5;
//        int col=1;
//        int ch1=1;
//
//
//        for (int i=0 ; i<row ; i++){
//            int ch2=ch1;
//            int ch3=4;
//            for (int j=0 ; j<col ; j++){
//                System.out.print(ch2+" ");
//                ch2=ch2+ch3;
//                ch3--;
//            }
//            System.out.println();
//            ch1++;
//            col++;
//        }
    }
}
