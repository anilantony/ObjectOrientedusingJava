public class ThreadTest1Run implements Runnable
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
    public static void main(String[] args) 
    {
        ThreadTest1Run tr=new ThreadTest1Run();
        Thread t1 = new Thread(tr);
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
        
    }
    
}