package Programming_bacth;

public class Question5 {


    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        char ch1 = 65;

        for(int i = 0; i < line; ++i) {
            char ch2 = (char)ch1;

            for(int j = 0; j < star; ++j) {
                if (j >= 2) {
                    System.out.print(ch2--);
                } else {
                    System.out.print(ch2++);
                }
            }

            System.out.println();
        }

    }
}
