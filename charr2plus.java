
import java.util.*;
public class charr2plus
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");//alokZ
        String s=sc.nextLine();
        int len=s.length();
        String sr="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            int s1=(int)(ch);
            int s1o=s1+2;
            if(ch=='y'||ch=='z'||ch=='Y'||ch=='Z')
            {
                s1o=s1-24;
            }
            char c=(char)(s1o);
            sr=sr+c;
        }
        System.out.println(sr);
    }
}