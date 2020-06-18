import java.util.*;
public class cd
{
    public static void main ()
    {
        System.out.println("enter text string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int len=s.length();
        int count=0;
        for(int i=0;i<len-1;i++)
        {
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch==ch2)
            {
                count++;
            }
        }
        System.out.println("number of double letters: " + count);
    }
}