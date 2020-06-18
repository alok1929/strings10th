	
import java.util.Scanner;

public class anagram
{
    public static void main(String[]args)
    {
        String str1;
        int l, len1, len2, i, j, found=0, nofound=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = scan.nextLine();
        
        l = str1.length();
        len2 = str2.length();
		
        if(l == len2)
        {
            
            for(i=0; i<l; i++)
            {
                found = 0;
                for(j=0; j<l; j++)
                {
                
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        found = 1;
                       
                        
                        break;
                        
                    }
                }
                if(found == 0)
                {
                    nofound = 1;System.out.println(nofound + "= not found");
                    break;
                }
            }
            if(nofound == 1)
            {
                System.out.print("not ANagram");
            }
            else
            {
                System.out.print("Strings are Anagram");
            }
        }
        else
        {
            System.out.print("not an Anagram");
        }
    }
}