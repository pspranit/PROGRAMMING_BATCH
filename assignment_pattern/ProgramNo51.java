package assignment_pattern;

public class ProgramNo51 {
    public static void main(String[] args) {

        int line=9;
        int star=1;
        int no1=1;
        int space=4;

        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(no1+" ");
            }
            if(i<4)
            {
                space--;
                star++;
                no1++;
            }
            else {
                space++;
                star--;
                no1--;
            }

            System.out.println();
        }
    }
}
