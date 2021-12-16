import java.util.*;
public class leapYear
{
    public static void main(String args[])
    {
        int year;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
               if(year%400==0)
               {
                System.out.println("Its a Leap Year");
               } 
               else
               System.out.println("Its not a Leap Year");
            }
            else
            {
                System.out.println("Its a Leap Year");
            }             
        }       
        else System.out.println("Its not a Leap Year");
        
    }
}
