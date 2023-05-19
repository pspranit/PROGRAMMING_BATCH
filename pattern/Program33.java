package pattern;

public class Program33 {
    public static void main(String[] args) {

        int row = 8;
        int col = 4;
        int space = 0;

        for (int i = 0; i < row; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print(" * ");
            }

            System.out.println();
            if(i<=2)
            {
                space++;
                col--;
            }
            else {
                col++;
            }
        }
    }
}
