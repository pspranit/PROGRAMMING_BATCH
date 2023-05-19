package QuestionAngularMind;

public class Program6 {
    public static void main(String[] args) {

        int line=5;
        int space=line-1;

        for (int i = 0; i <line ; i++) {
            for (int j = 0; j < space; j++) {
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
