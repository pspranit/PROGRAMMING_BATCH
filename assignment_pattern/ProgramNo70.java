package assignment_pattern;

public class ProgramNo70 {
    public static void main(String[] args) {

        int line=5;
        int star=1;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star+=2;
        }
    }
}
