import java.util.Scanner;
//By place one 
public class leftrotate{
    public static void main(String[] args)
    {
      int[] number = {1,2,3,4,5};
      int temp = number[0];
      int i;
      for(i=1 ; i< number.length ; i++)
      {
        number[i-1]=number[i];
      }
      number[number.length-1] = temp;
      System.out.println("Array after left rotation :");
      for(int num : number)
      {
        System.out.print(num+" ");
      }
    }
}