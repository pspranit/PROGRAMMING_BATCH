package pattern.string;

public class Palindrome {

    public static void main(String[] args) {
        String str="nitin";
        String str1="";
        String pali=str;

        for (int i = str.length()-1; i>=0 ; i--) {
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
        if (str1.equals(pali))
        {
            System.out.println("STRING IS PALINDROME");
        }
        else System.out.println("STRING NOT PALINDROME");
    }

}
