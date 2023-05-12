import java.util.Scanner;
class Pattern11
{
    public static void main(String[]args)
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a Row");
        // int a=sc.nextInt();
        // System.out.println("Enter a Column=");
        // int b=sc.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j<=i && i%2!=0)
                {
                    System.out.print("*");
                }
                // else
                // {
                //     System.out.print(" ");
                // }
                
            }
            System.out.println();
        }
        //sc.close();
    }
}
