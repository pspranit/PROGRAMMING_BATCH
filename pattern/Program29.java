package pattern;

public class Program29 {
    public static void main(String[] args) {

        int row = 5;
        int col = 1;
        int space = 4;

        for (int i = 0; i < row; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" _ ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print(" * ");
            }

            System.out.println();
            space--;
            col++;

        }
    }
}