import java.io.*;

public class FileExample_o 
{

    public static void main(String[] args) throws Exception
    {
        
        try(FileInputStream fis=new FileInputStream("Test.txt");)
        {
            int x;
            while((x=fis.read())!=-1)
            {
                System.out.print((char)x);
            }
        }
    } 
}           