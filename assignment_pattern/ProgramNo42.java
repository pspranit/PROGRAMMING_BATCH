package assignment_pattern;

public class ProgramNo42 {
    public static void main(String[] args) {

        int line=10;
        int star=5;
        int space=0;
        int no1=1;
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
                space++;
                star--;
                no1++;
            }
            else if(i>4)
            {
                space--;
                star++;
                no1--;
            }
            System.out.println();

        }
    }
}
