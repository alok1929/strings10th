import java.util.*;
public class allformsofanagram
{
    public static void main ()
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();String b="";
        int len=s.length();int q=1;       
        for(int k=0;k<len-1;k++,q++)
        {
            char ch=s.charAt(k);            
            System.out.println(ch);
            String str=s.substring(0,k);
            b=ch+b;
            System.out.println(str);
            System.out.println(b);       
            while(q!=s.lastIndexOf(ch))
            {
                char ch1=s.charAt(k+q);
                System.out.println(ch1);
        }
    }
}
}
    


