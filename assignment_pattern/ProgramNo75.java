package assignment_pattern;

public class ProgramNo75 {
    public static void main(String[] args) {

        int star=3;
        int line=5;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                if(j==i+1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
            star+=2;
        }


    }
}
