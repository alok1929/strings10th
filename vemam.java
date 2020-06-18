import java.util.*;
public class vemam
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner(System.in);
        String r=ss.next();
        String s=r.toUpperCase();
        int len=s.length();int k;
        for(char m='A';m<='Z';m++)
        {
            k=0;
            for(int i=0;i<len;i++)
            {
                char ch=s.charAt(i);
                if(ch==m)
                {
                    k++;
                }
            }
        
        if(k>0)
        {
            System.out.println("the character " + m + "has been repeated " + k + "number of times");
        }
    }
}
}