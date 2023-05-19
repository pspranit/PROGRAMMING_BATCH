package assignment_pattern;

public class Program35 {
    public static void main(String[] args) {

        int line=6;
        int star=1;
        char ch='A';
        char ch1=ch;
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print(ch1+++" ");
            }
            System.out.println();
            ch++;
            star++;
        }
    }
}
