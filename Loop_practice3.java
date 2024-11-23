import java.util.Scanner;
public class Loop_practice3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting Number :");
        int s = input.nextInt();
        System.out.print("Enter the ending number : ");
        int e = input.nextInt();
        System.out.print("Enter the table number :  ");
        int t = input.nextInt();

        while(s<=e)
        {
            System.out.println(s + " *" + t + " = " + (s*t));
            s++;
        }
    }
    
}
