package Programming_bacth;


public class Question2 {


    public static void main(String[] args) {
        int line = 5;
        int star = 5;

        for(int i = 1; i <= line; ++i) {
            for(int j = 1; j <= star; ++j) {
                if (j != 1 && i != 5 && j != 5 && i != 1 && i + j != 6 && i != j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

    }
}
