package assignment_pattern;

public class Program37 {
    public static void main(String[] args) {
        int line=6;
        int star=1;
        char ch1='A';

        for (int i = 0; i < line; i++) {
            char ch2=ch1;
            for (int j = 0; j < star; j++) {
                System.out.print(ch2);
                ch2+=5;
                }
                System.out.println();
                ch1++;
                star++;
            }

//        int row=6;
//        int col=1;
//        int ch1=65;
//
//        for (int i=0 ; i<row ; i++){
//            int ch2=ch1;
//            for (int j=0 ; j<col ; j++){
//                System.out.print((char)ch2+" ");
//                ch2=ch2+5;
//            }
//            System.out.println();
//            ch1++;
//            col++;
//        }

        }
    }

