package assignment_pattern;

public class Program27 {
    public static void main(String[] args) {
        int line=9;
        int star=1;
        char ch='A';
        for (int i = 0; i < line; i++) {
            char ch1=ch;
            for (int j = 0; j < star; j++) {
                System.out.print(ch1);
            }
            if(i<4)
            {
                star++;
                ch++;
            }
            else {
                 star--;
                 ch--;
            }
            System.out.println();
        }
    }
}
