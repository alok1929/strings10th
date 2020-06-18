public class Sstarpattern
{
    public static void main ()
    {
        int q=0;
        for(int i=1;i<10;i++)
        {
            for(int k=1;k<i;k++)
            {
                if(i==1 && k==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(q);
                }
                if(i==2 && k==2||k==4 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(i==3 && k==2 ||k==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if( i==4 && k==2 ||k==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(i==5 && k==3 || k==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(i==6 && k==4 || k==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(i==7 && k==1 || k==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(i==8 && k==2 || k==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(i==9 && k==3 ||k==4 ||k==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}