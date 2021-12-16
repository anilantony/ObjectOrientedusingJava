public class CoprimeNo 
{
    int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
            
    public static void main(String[] args) 
    {
        primeNo x=new primeNo();
        int gcf=x.gcd(35,56);
        System.out.println(gcf);
        if (coPrime(gcf)==true)
        System.out.println("Co-Prime Number");

    } 
        
    static boolean coPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return true;
        }
        return false;
    }
}

