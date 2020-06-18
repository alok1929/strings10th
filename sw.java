import java.util.*;
public class sw
{
    public static void main()
    {
        System.out.println("enter the choice");
        System.out.println("1.) to print ascii value");
        System.out.println("2.) the I triangle");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("the ascii values of small letters are:");
            for(char ch='a';ch<='z';ch++)
            {
               int ascii=(int)ch;
               System.out.println(ch+" - "+ascii);
            }
            break;
            
            case 2:
            System.out.println("enter the number of rows:");
            int rows=sc.nextInt();
            for(int q=1;q<=rows;q++)
            {
                for(int w=1;w<=q;w++)
                {
                    System.out.print(w+" ");
                }
                System.out.println("");
            } 
            break;
            
            default:
            System.out.println("invalid choice");
            break;
        }
    }
}