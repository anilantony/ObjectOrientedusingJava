import java.lang.*;
public class printing
{
    public static void main(String args[])
    {
        int x=10,y=20;
        float b=12.55f;
        char c='A';
        String str= "Hello";
        System.out.print("char is"+c);
        System.out.println("String is"+str);
        System.out.printf("Number and characters are %1$f %3$c %2$s",b,str,c);
        System.out.println("Number is"+y);
        System.out.println(x+y);
        System.out.println("Number is "+x+y);
        System.out.println("Number is "+(x+y));
        }
}