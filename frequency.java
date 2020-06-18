import java.util.*;
public class frequency
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();//
        int len=s.length();
        String r=s.toUpperCase();int i,k=0;
        for(char c='A';c<='Z';c++)
        {
          k=0;
            for( i=0;i<len;i++)
            {
                char ch=r.charAt(i);
                if(ch==c)
                {
                    k++;
            }
        }
            if(k>0)
            {
                System.out.println("the character " + c + "has been repeated " + k + "number of times ");
            }
            
        }
    } 
}
