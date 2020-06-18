import java.util.*;
public class plus
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        String sr=s.toLowerCase();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=sr.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                int newchar=ch+1;
                char cha=(char)newchar;
                System.out.print(cha);
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}