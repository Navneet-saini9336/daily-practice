/*Pattern 
 *
 * * *
 * * * *
 * * * * *
 * * * *
 * * * 
 * *
 * 
 */
import java.util.Scanner;
public class Loop_practice5 {
    public static void main(String[] args)
    {
        int i ;
        for( i=1 ; i<=4 ; i++)
        {
            for(int j = 1 ; j<=i ; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for( i=1 ; i<=4 ; i++)
        {
            for(int j = 3 ; j>=i ; j-- )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
