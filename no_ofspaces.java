import java.util.*;
public class no_ofspaces
{
    public static void amin()
    {
        System.out.println("enter string:");
        Scanner dd=new Scanner (System.in);
        String s=dd.nextLine();
        int len=s.length();
        int c=0;
        for(int i=0;i<len-1;i++)
        {
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch))
            {
                c++;
            }
        }
        System.out.println("number of white spaces : " + c);
    }
}