package angularMind;

public class Question2 {
    public static void main(String[] args) {

        int line=5;
//        int star=5;
        int space=line-1;

        for (int i = 0; i < line; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < line; j++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}
