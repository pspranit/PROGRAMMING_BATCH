package assignment_pattern;

public class ProgramNo40 {
    public static void main(String[] args) {

        int line=5;
        int star=1;
        int no1=5;
        for (int i = 0; i < line; i++) {
            int no2=no1;
            for (int j = 0; j < star; j++) {
                System.out.print(no2--);
            }
            System.out.println();
            star++;
        }
    }
}
