package assignment_pattern;

public class ProgramNo78 {
    public static void main(String[] args){

        int line=5;
        int star=1;
        int star2=5,star3=5,star4=1;
        int space=line-1;
        int space2=0,space3=4;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int k = 0; k < star2; k++) {
                System.out.print("*");
            }
//////////////////////////////////////////////////////////////
            for (int s1 = 0; s1 < space2; s1++) {
                System.out.print(" ");
            }

            for (int l = 0; l < star3; l++) {
                System.out.print("*");
            }
            for (int s1 = 0; s1 < space3; s1++) {
                System.out.print(" ");
            }

            for (int m = 0; m < star4; m++) {
                System.out.print("*");
            }
            System.out.println();
            star++;
            star2--;
            space--;
            space2+=2;
            star3--;
            star4++;
            space3--;
        }

    }
}