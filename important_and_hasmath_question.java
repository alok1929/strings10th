import java.util.*;//for lowercase it is character+26-3//and for uppercase it is character-26+5//
public class important_and_hasmath_question
{
    public static void main()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner(System.in);
      String s=ss.nextLine();
        int len=s.length();  
        for(int i=0;i<len;i++)
       {
           char ch=s.charAt(i);
           if(Character.isLowerCase(ch))
          {
           if(ch=='a'||ch=='b' ||ch=='c')
           {
               int abc=(int)ch+26-3;
               char c=(char)abc;
               System.out.print(c);
            }
           else{
          int y=(int)ch-3;
          char cha=(char)y;          
          System.out.print(cha);
        }
    }
    if(Character.isUpperCase(ch))
    {
        if(ch=='V' ||ch=='W'|| ch=='X'||ch=='Y'||ch=='Z')
        {
        int uy=(int)ch-26+5;
        char chach=(char)uy;
        System.out.print(chach);
    }
    else
    {
        int ily=(int)ch+5;
        char il=(char)ily;
        System.out.print(il);
    }
}
}
}
}
        
   


       
        