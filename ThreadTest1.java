class ThreadTest1 extends Thread
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
        ThreadTest1 t1=new ThreadTest1();
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
        
    }
  
}