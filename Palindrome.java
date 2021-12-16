import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3 Digit Number");
        int n=sc.nextInt();
        int m=n;
        int rev=0;
        int r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m)
            System.out.println("Its an Palindrome Number");
        else
            System.out.println("Its not an Palindrome Number ");
    }
}