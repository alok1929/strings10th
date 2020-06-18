import java.util.*;
public class vowels
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();
        int l=s.length();
        char ch;int count=0; 
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'|| ch=='i'|| ch=='o'|| ch=='u')
            {
                count++;
            }
            if(ch=='A'|| ch=='I' || ch=='O' || ch=='U')
            {
                count++;
            }
        }
        System.out.println("count of vowels: " + count);
    }
}