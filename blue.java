import java.util.*;
public class blue
{
    public static void main()
    {
        System.out.println("enter the word");
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();   //blue
        int len=b.length();   //4
        for(int i=0;i<len;i++)
        {
            char x=b.charAt(i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        }
    }
                
         