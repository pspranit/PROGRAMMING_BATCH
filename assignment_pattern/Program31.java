package assignment_pattern;

public class Program31 {
    public static void main(String[] args) {

        int line=6;
        int star=1;
        int space=5;
        char ch='A';
        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            char ch1=ch;
            for (int j = 0; j < star; j++) {
                System.out.print(ch1+++" ");
            }
            System.out.println();
            star++;
            space--;
        }
    }
}
