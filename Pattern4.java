import java.util.Scanner;
class Pattern4
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Row=");
        int a=sc.nextInt();
        System.out.println("Enter a column=");
        int b=sc.nextInt();
        char c='a';
        char d='b';
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                if(i%2==0)
                {
                    System.out.print(d+" ");

                }
                else
                {
                    System.out.print(c+" ");
                }

            }
                     System.out.println();
        }
        sc.close();
    }
}
