import java.util.Scanner;
class Pattern7
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Row=");
        int a=sc.nextInt();
        System.out.println("Enter a column=");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(" 1 ");
                }
                else
                {
                
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}