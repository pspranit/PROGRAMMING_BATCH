package assignment_pattern;

public class Program34 {
    public static void main(String[] args) {

        int line=6;
        int star=6;
        char ch='A';
        for (int i = 0; i < line; i++) {
            char ch1=ch;
            for (int j = 0; j < star; j++) {
                System.out.print(ch1++);
            }
            System.out.println();
            star--;
        }
    }
}
