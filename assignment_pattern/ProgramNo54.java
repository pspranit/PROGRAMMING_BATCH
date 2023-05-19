package assignment_pattern;

public class ProgramNo54 {
    public static void main(String[] args) {

        int line=9;
        int star=9;
        int no1=9;
        int space=0;

        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(no1+" ");
            }
            System.out.println();
            space++;
            star--;
            no1--;
        }
    }
}
