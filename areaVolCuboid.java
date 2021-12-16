import java.lang.*;
import java.util.*;
class areaVolCuboid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int length,breadth,height;
        long Area,Volume;
        System.out.println("Enter Values of a,b,c");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        Area=2*(length*breadth+breadth*height+length*height);
        Volume=length*breadth*height;
        System.out.println("Area" + Area);
        System.out.println("Volume" + Volume);
    }
}