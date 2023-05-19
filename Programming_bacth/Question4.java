package Programming_bacth;


public class Question4 {

    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        char ch1 = 'A';

        for(int i = 0; i < line; ++i) {
            for(int j = 0; j < star; ++j) {
                if (ch1 >= 'G') {
                    System.out.print(ch1++);
                    ch1 = 'A';
                } else {
                    System.out.print(ch1++);
                }
            }

            System.out.println();
        }

    }
}

