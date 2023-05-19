package assignment_pattern;

public class ProgramNo79 {
    public static void main(String[] args) {

        int line=9;
        int star=1;
        int space=4;
        int star1=1;
        int space2=4;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < space2 ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < star1; j++) {
                System.out.print("*");
            }

            if(i<4)
            {
                star++;
                space--;
                star1++;
                space2--;
            }
            else
            {
               space++;
               space2++;
               star--;
               star1--;
            }
            System.out.println();

        }
    }
}
