
package converttobinary;

import java.util.Scanner;

public class ConvertToBinary {

    public static String intToBinary(int n)
{
    String s = "";
    while (n > 0)
    {
        s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
        n = n / 2;
    }
    return s;
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,count=0, maxcount=0;
        String s1=intToBinary(n);
        char[] array=s1.toCharArray();
       // System.out.println(s1);
        for( i=0;i<array.length;i++)
        {
            if(array[i]=='1')
            {
                count++;
                
            }
            else
            {
                if(count>maxcount)
                {
                    maxcount=count;
                }
                count=0;
            }
            if(count>maxcount)
                maxcount=count;
        }
        System.out.println("Count="+maxcount);
    
    
    }
}

