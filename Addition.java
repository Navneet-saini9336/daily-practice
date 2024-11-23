import java.util.Scanner;
public class Addition {
    protected int num1;
    protected int num2 ;
    protected int res;
    public void acceptNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num1 = sc.nextInt();
        System.out.println("Enter scond number : ");
        num2 = sc.nextInt();
    }
    public void add()
    {
        res = num1+ num2;
    }
    public void showResult()
    {
        System.out.println(res);
    }
}
