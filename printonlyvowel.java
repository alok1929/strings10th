import java.util.*;
public class printonlyvowel
{
    static public void main ()
    {
      System.out.println("enter string: ");
      Scanner ss=new Scanner (System.in);
      String s=ss.nextLine();
      int len=s.length();
      for(int i=0;i<len;i++)
      {
          char ch=s.charAt(i);
          if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u')
          {
              System.out.print(ch);
            }
            else
            {
                continue;
            }
        }
    }
}
  