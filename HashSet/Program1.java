package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {

        Set<Integer> hs1=new HashSet<>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(10);    //duplicate element

        for(int a:hs1)
        {
            System.out.println(a);
        }
    }
}
