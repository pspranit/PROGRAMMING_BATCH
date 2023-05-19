package assignment_pattern;

public class ProgramNo73 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        char ch1='A';

        for (int i = 0; i < line; i++) {
            char ch2=ch1;
            for (int j = 0; j < star; j++) {
                if(j>=i)
                {
                    System.out.print(ch2--);
                }
                else {
                    System.out.print(ch2++);
                }
            }
            System.out.println();
            star+=2;
        }
    }
}
