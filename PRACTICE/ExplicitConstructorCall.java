 class Demo3
{
    Demo3(int a)
    {
        System.out.println("VALUE OF A IS :"+a);
        System.out.println("SUPER CLASS CONSTRUCTOR CALL");

    }
}
 class Sample3 extends Demo3
{
    Sample3()
    {
        super(25);//------> Declered by Programmer
        System.out.println("EXPLICIT SUB CLASS CONSTRUCTOR CALL");
    }
}

public class ExplicitConstructorCall {
    public static void main(String[] args) {

        System.out.println("EXPLICIT CONSTRUCTOR CALL ");
        Sample3 s=new Sample3();
    }
}
