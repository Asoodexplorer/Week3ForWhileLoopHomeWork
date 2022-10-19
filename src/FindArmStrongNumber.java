import java.util.Scanner;

public class FindArmStrongNumber

        // Find an Armstrong number by entering any number.
{
    public static void main(String[] args)
    {
        // CREATING OBJECT
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        // storing original value in temp variable
        int A=n;
        int temp=0;
        // calculating the cube sum of digit of that number
        while(n>0)
        {
            int a=n%10;
            temp=temp+(a*a*a);
            n=n/10;
        }
        // comparing with the original value and printing  it.
        if (A==temp)
            System.out.print(A +  "  Is an Armstrong number");
        else
            System.out.print(A+   "  Is not an Armstrong number");
    }

}
