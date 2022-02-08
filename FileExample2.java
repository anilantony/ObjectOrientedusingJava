import java.io.*;

public class FileExample2 
{

    public static void main(String[] args) throws Exception
    {
        
        try(FileInputStream fis=new FileInputStream("Test.txt");)
        {
        
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String str= new String(b);
        System.out.println(str);
        }
    }
    
}