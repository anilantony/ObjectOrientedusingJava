import java.io.*;
public class RandomAccessDemo 
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile rf=new RandomAccessFile("Data.txt","rw");
       //byte b[]={'A','B','C','D','E','F','G''H','I','J'};       
        System.out.print((char)rf.read());
        System.out.print((char)rf.read());
        System.out.print((char)rf.read());
        rf.write('d');
        System.out.print((char)rf.read());
        rf.skipBytes(3);
        System.out.print((char)rf.read());
        rf.seek(3);
        System.out.print((char)rf.read());
        System.out.print(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.print((char)rf.read());
    
    }   
}