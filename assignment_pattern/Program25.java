package assignment_pattern;

public class Program25 {
    public static void main(String[] args) {

        int line=5;
        int star=1;

        for (int i = 0; i < line; i++) {
            char ch='A';
            for (int j = 0; j < star; j++) {
                System.out.print(ch++);
            }
            System.out.println();
            star++;

        }
    }
}


