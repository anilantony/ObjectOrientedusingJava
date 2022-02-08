import java.io.*;
public class FileExample_try
{
    public static void main(String[] args) 
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("Test.txt");
            String str="Learn Java Programming.";
            byte b[]=str.getBytes();
            fos.write(b);
        }
        
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        
    }
}