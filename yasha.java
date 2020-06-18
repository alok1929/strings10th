import java.util.*;
public class yasha
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner(System.in);
        String s=ss.nextLine();
        int len=s.length();
        String r=s.toUpperCase();int c=0;
        for(int i=0;i<len-1;i++)
        {
            char ch=r.charAt(i);
            char cha=r.charAt(i+1);
            if(ch==cha)
            {
                c++;
            }
            }
        System.out.println(c);
    }
}