package pattern.numberSeries;

public class Factorial {
    public static void main(String[] args) {

        int a=5;
        long fact=1;

        for (int i = 1; i <=a; i++) {
            fact=fact*i;
        }
        System.out.println("FACTORIAL FINAL :"+fact);
    }
}
