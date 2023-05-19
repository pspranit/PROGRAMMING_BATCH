package QuestionAngularMind;

public class Pattern2 {
    public static void main(String[] args) {

        int line=5;
//        int star=1;
        int no1=1;
        int no2=0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i+1; j++) {
                if(j%2==0)
                {
                    System.out.print(no1);
                }
                else {
                    System.out.print(no2);
                }
            }
            System.out.println();
//            star++;
        }
    }
}
