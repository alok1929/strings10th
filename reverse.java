import java.util.*;
public class reverse
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();String b="";int k=0;
        int len=s.length();
        for(int i=len-1;i>=0;i--)
        {
            b=b+s.charAt(i);
         
       
       
    }
       System.out.println(b);
}
}
