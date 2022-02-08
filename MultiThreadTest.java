class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
}
public class MultiThreadTest {

    public static void main(String[] args) 
    {
        MyThread t=new MyThread("MyThread");
        System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());
    }
}