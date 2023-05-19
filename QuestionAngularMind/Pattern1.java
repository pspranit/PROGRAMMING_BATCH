package QuestionAngularMind;

public class Pattern1 {
    public static void main(String[] args) {

        int line =5;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i+1; j++) {
                if(j==0||i==4||i==j)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
