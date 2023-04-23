import java.util.Scanner;
class Pattern2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row=");
        int a=sc.nextInt();
        System.out.println("Enter a column=");
        int b=sc.nextInt();
        char c='a';
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                System.out.print(c+" ");
            }
                c++;
                System.out.println();
        }
        sc.close();
    }
}