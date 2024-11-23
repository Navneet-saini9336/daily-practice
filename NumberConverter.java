import java.util.Scanner;

public class NumberConverter {
    static String[] x = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                         "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] y = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 19) {
            System.out.print(x[n] + " ");
        } else if (n >= 20 && n <= 99) {
            System.out.print(y[n / 10] + " " + x[n % 10]);
        } else {
            System.out.print("Number out of range");
        }
    }
}