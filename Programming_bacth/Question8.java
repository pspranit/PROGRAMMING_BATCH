package Programming_bacth;

public class Question8 {
    public static void main(String[] args) {

        int line=6;
        int star=1;
        int space=0;

        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star++;
            space++;
            System.out.println();
        }
    }
}
