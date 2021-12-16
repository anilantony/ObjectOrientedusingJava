import java.lang.*;
public class StrEx
{
    public static void main(String args[])
    {
        String str1="Java";
        String str2=new String("New Java");
        char c[]={'H','e','l','l','o'};
        byte b[]={65,66,67,68};
        String str3=new String(c);
        String str4=new String(b);
        String str5=new String(b,1,2);
        System.out.println("string"+str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    } 
}   
