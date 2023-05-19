package assignment_pattern;

public class ProgramNo58 {
    public static void main(String[] args) {

        int line=9;
        int star=5;
        int no1=1;

        for (int i = 0; i < line; i++) {
            int no2=no1;
            for (int j = 0; j < star; j++) {
                System.out.print(no2++);
            }
            if(i<4)
            {
                star--;
            }
            else
            {
                star++;
            }
            System.out.println();
        }
    }
}
