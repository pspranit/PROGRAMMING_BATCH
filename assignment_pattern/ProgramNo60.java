package assignment_pattern;

public class ProgramNo60 {
    public static void main(String[] args) {

        int line=9;
        int star=5;
        int no1=1;
        int space=0;

        for (int i = 0; i < line; i++) {
            int no2=no1;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(no2+++" ");
            }
            if(i<4)
            {
                star--;
                space++;
                no1++;
            }
            else {
                star++;
                space--;
                no1--;
            }
            System.out.println();

        }

    }
}
