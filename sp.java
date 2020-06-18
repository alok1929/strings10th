import java.util.*;
public class sp
{
    public static void main()
    {
        System.out.println("enter string");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length();
        for(int i=0;i<=len;i++)
        {
            String ch=s.substring(0,i);
            System.out.print(ch);
           System.out.println("");
        }
         
    }
}