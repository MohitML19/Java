public class StarPattern6 {
    public static void main(String[] args) {
        int nrow = 6;
        int star = nrow+(nrow-1);
        int space = 0;
        for(int i = 1;i<=nrow;i++)
        {
            for(int k = 1; k<=space;k++)
            { 
                System.out.print(" ");
            }
            for(int j = 1; j<=star;j++)
            {
                if(j==1||j==star||i==1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            space = space+1; star = star-2;
        }
        
    }
}
    

