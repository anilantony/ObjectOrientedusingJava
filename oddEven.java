import java.util.*;
public class oddEven
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("It is an Even Number");            
        }       
        else
        {
            System.out.println("It is an Odd Number");
        }
    }
}