package angularMind;

public class Question1 {
    public static void main(String[] args) {

        int line=5;
        int star=1;
        int space=line-1;

        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star++;
            space--;
            System.out.println();
        }
    }
}
