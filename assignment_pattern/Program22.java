package assignment_pattern;

public class Program22 {
    public static void main(String[] args) {

        int line=5;
        int star=5;
        int space=0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}
