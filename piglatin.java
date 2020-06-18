import java.util.*;
public class piglatin
{public static void main()
    {System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String str=st.toUpperCase();
        int len=str.length();
        int j;String c;
        for(int i=0;i<len;i++)
        {char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {j=str.indexOf(ch);
                
               c=str.substring(j);
            
            String ss=str.substring(0,j);
        
        System.out.println(c+ss+"AY");
           break;}
         }
    }
}