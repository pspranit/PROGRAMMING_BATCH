package pattern.string;

public class SplitFun {

    public static void main(String[] args) {

        String str="this is programming";

        String [] newStr= str.split(" ", 0);

        for (String a:newStr)
        {
            System.out.println(a);
        }
    }
}
