 import java.util.*;
public class countdouble2
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String str=ss.nextLine();
       int str1=str.length();
        int i,c=0;
        char ch1,ch2;
        for(i=0;i<str1-1;i++)
        {
            ch1=str.charAt(i);
            ch2=str.charAt(i+1);
        
        if(ch1==ch2)
        {
            c++;
        }
    }
     System.out.println("double letters count: " + c);
    }
}  