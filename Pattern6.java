import java.util.Scanner;
class Pattern6
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row=");
        int a=sc.nextInt();
        System.out.println("Enter a column=");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int c=5;
            int d=2;
            for(int j=1;j<=b;j++)
            {
                if(i%2==0)
                {
                    System.out.print(d+" ");
                    d=d+2;   
                }
                else{
                    System.out.print(c+" ");
                    c=c+5;
                }
            }
            System.out.println();
        }
        sc.close();        
        
    }
}