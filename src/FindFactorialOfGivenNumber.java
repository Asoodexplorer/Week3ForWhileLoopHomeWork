import java.util.Scanner;

public class FindFactorialOfGivenNumber


{

    public static void main(String args[])
    {
        int x=1,f=1, n ;
        // creating object .
        Scanner sc = new Scanner(System.in);
        // entering a number .
        System.out.println("Enter a number :");
        n = sc.nextInt();
        sc.close();
        //calculating factorial value .
        while(x<=n)
        {
            f  = f * x;
            x++;
        }
        // printing factorial value
        System.out.println("Factorial of "+n+" = "+f);
    }
}
