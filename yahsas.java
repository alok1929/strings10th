import java.util.*;
public class yahsas
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String s=ss.nextLine();        
        int len=s.length();String m="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            int chara=(int)ch;
            for(int j=i+1;j<len;j++)
            {
            char cha=s.charAt(j);
            int chs=(int)cha;
                          if(chara<chs)
                          {
                   char newi=(char)chara;
                   char newj=(char)chs;
                  m= s.replace(newj,newi);
                }
        }
        System.out.print(m);
}
}
}
        