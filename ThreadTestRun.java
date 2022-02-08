class MyThread implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadTestRun 
{    
    public static void main(String[] args) 
    {
        MyThread th=new MyThread();
        Thread t1 = new Thread(th);
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
   }
}