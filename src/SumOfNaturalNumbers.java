import java.util.Scanner;

public class SumOfNaturalNumbers

{
        public static void main(String args[])
    {
        System.out.println("Enter the last element");
        //Taking input from user
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i=0, sum=0;
        while(i<=num)
        {
        //Iterating the counter for each iteration
        //and adding the value to the previously existing sum.
        sum+=i;
        i++;
        }
        System.out.println("The sum of natural numbers including "+num+" is "+sum);
    }








}
