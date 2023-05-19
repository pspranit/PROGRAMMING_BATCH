package QuestionAngularMind;

public class Pattern4 {
    public static void main(String[] args) {

        int line=5;
        int star=5;
        int no1=0;
        int no2=1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print(no1);
               if(j>star){
                   no1++;
               }
               else {
                   System.out.print(no1);
               }
            }
            System.out.println();
        }
    }
}
