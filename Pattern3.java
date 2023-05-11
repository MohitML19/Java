import java.util.Scanner;
class Pattern3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a row=");
        int a=sc.nextInt();
        System.out.println("enter a column=");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            char c='a';
            for(int j=1;j<=b;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }    
        sc.close();
        
    }
}