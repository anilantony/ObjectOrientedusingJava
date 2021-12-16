class parent
{
    public  parent()
    {
         System.out.println("Parent Construction");
    }
}
class child extends parent
{
    public child()
    {
        System.out.println("Child Construction");
    }
}
class grandChild extends child
{
    public grandChild()
    {
        System.out.println("grandChild Construction");
    }
}
public class Inheritance 
{
    public static void main(String args[]) 
    {
        parent p=new parent();
        child c=new child();
        grandChild g= new grandChild();
    }
}