package assignment_pattern;

public class Program17 {
    public static void main(String[] args) {

        int line=9;
        int star=5;
        int space=0;

        for (int i = 0; i <line ; i++) {
            for (int k = 0; k < space ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if(i<4)
            {
                space++;
                star--;
            }
            else {
                star++;
                space--;
            }
            System.out.println();
        }
    }
}
