import java.util.*;
public class spaceplusone
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length();
        for(int i=0;i<len-1;i++)
        {
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch))
            {
                char chq=s.charAt(i+1);
                System.out.println(chq);
            }
        }
    }
}