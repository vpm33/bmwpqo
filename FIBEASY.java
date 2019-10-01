import java.util.*;
import java.lang.Math;
import java.io.*;
class FIBEASY
{
    static long[] f = new long[100];
    static void fib(long size)
    {
        f[0] = 0; 
        f[1] = 1;
        for (int i = 2; i <= size; i++) 
            f[i] = (f[i - 1] + f[i - 2]) % 10;
    } 
    public static void main(String[] args)
    {   Scanner s=new Scanner(System.in);
        long T=s.nextLong();
        fib(60);
        while(T-->=0)
        {
            long N=s.nextLong();
            long min=0;
            while(N>0)
            {   
                N = N >> 1;
                min++;
            }
            double req = Math.pow(2, min-1);
           System.out.println(f[(int) ((req - 1) % 60)]);
        }
        s.close();
    }
}
