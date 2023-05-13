public class StarPattern1 {
    public static void main(String[] args) {
        int n = 6;
        for(int row = 1;row<=n;row++)
        {
            for(int col = 1; col<=n;col++)
            {
                if(row==col||col==1)
                {
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++)
        {
            for(int col =1;col<=n;col++)
            {
                if(row+col==n+1||col==1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
