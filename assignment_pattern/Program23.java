package assignment_pattern;

public class Program23 {
    public static void main(String[] args) {

        int line=9;
        int star=5;
        int space=0;

        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
//                if (j == 2) {
//                    System.out.print("+");
//                } else {
//                    System.out.print("*");
//                }
                System.out.print("*");
            }
            if(i<4)
            {
                space++;
            }
            else {
                space--;
            }
            System.out.println();
        }
    }
}
