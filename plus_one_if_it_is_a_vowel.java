import java.util.*;
public class plus_one_if_it_is_a_vowel
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.next();
        String low=s.toLowerCase();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
          char ch=low.charAt(i);
            if(ch=='a'||ch=='e' || ch=='i'||ch=='o'||ch=='u')
            {
              int ne =ch+1;
            char cha=(char)ne;
               System.out.print(cha);
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}