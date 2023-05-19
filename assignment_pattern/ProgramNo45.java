package assignment_pattern;

public class ProgramNo45 {
    public static void main(String[] args) {
        int line=9;
        int star=1;
       // int no1=1;

        for (int i = 0; i < line; i++) {
            int no2=1;
            for (int j = 0; j < star; j++) {
                System.out.print(no2++);
            }
            System.out.println();
            star++;

        }
    }
}
