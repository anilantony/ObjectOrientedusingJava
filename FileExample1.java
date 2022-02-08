import java.io.*;
public class FileExample1 
{
    public static void main(String[] args) throws IOException
    {
        try(FileOutputStream fos=new FileOutputStream("Test.txt");)
        {
        String str="Learn Java Programming.";
        byte b[]=str.getBytes();
        fos.write(b);
        }
    }
    
}