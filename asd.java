import java.util.*;
public class asd
{
    public static void main ()
    {
        System.out.println("enter string:");
        Scanner ss=new Scanner (System.in);
        String str=ss.nextLine();
        int st=str.length();
       char temp;
        int low=0,up=0,special=0,dig=0;
        for(int i=0;i<st;i++)
        {
            temp=str.charAt(i);
            if(temp>='a' && temp<='z')
            {
                low++;
            }
            else if(temp>='A' && temp<='Z')
            {
                up++;
            }
            else if(temp>=0 && temp<=9)
               {
                 dig++;
                }
                else{
                    special++;
                }
            }
            System.out.println("lowercase:" + low);
            System.out.println("uppercase:" + up);
            System.out.println("specialcharacters:" + special);
            System.out.println("number of digits:" + dig); 
        }
    }