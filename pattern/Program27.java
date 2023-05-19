package pattern;

import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("END POSITION");
        int end=sc.nextInt();

        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + end + " terms:");

        for (int i = 1; i <= end; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
