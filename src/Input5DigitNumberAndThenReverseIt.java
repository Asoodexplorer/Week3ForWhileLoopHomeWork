import java.util.Scanner;

public class Input5DigitNumberAndThenReverseIt


{

//
//    Iterative function to reverse
//    digits of num
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    // Driver code
    public static void main(String[] args)
    {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number to Reverse : ");
        int n = scanner.nextInt();

        System.out.println("Reverse of no. is "
                + reverseDigits(n));
    }












}

