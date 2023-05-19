package assignment_pattern;

public class ProgramNo56 {
    public static void main(String[] args) {

        int line=5;
        int star=1;
        int no1=1;
        int space=line-1;

        for (int i = 0; i < line; i++) {
            int no2=no1;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(no2+++" ");
            }
            System.out.println();
            star++;
            space--;
        }
    }
}
