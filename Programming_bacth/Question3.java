package Programming_bacth;


public class Question3 {

    public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space = 4;
        char ch1 = 'A';

        for(int i = 0; i < line; ++i) {
            int j;
            for(j = 0; j < space; ++j) {
                System.out.print(" ");
            }

            for(j = 0; j < star; ++j) {
                System.out.print(ch1++);
            }

            System.out.println();
            ++star;
            --space;
        }

    }
}
