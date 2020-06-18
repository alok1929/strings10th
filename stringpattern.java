import java.io.*;
import java.lang.*;
import java.util.*;
public class stringpattern
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String r=ss.nextLine();
        int len=r.length();
        int i;
        for(i=0;i<=len;i++)
        {
            String str=r.substring(0,i);
            System.out.print(str);
        
        System.out.println();
    }
}
}