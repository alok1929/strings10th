import java.util.*;
public class cd2
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        String b="";
        int len=s.length();int k=0;
        for(int i=0;i<len-1;i++)
        {
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch==ch2)
            {
                k++;
            }
        }
        System.out.println(k);
    }
}