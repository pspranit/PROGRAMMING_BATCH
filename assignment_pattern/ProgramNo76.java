package assignment_pattern;

public class ProgramNo76 {
    public static void main(String[] args) {

        int line=5;
        int star=1;
        int no=1;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print(no+++" ");
            }
            System.out.println();
            star++;
        }
    }
}
