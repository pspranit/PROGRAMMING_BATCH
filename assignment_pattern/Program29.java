package assignment_pattern;

public class Program29 {
    public static void main(String[] args) {

        int line=12;
        int star=6;
        char ch='A';

        for (int i = 0; i < line; i++) {
            char ch1=ch;
            for (int j = 0; j < star; j++) {
                System.out.print(ch1++);
            }
            if(i<5)
            {
                star--;
            }
            else if(i>5)
            {
                star++;
            }
            System.out.println();
        }
    }
}
