import java.util.Scanner;

public class PrintPalindromeNumber
{
//  input any number and check if its Palindrome or not?
    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int palnumber = scanner.nextInt();

        int originalNumber = palnumber;
        int reminder = 0;
        int reversedNumber = 0;
        while (palnumber != 0) {

            reminder = palnumber % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            palnumber = palnumber / 10;
        }
//      here it will print thr reversed number to ccheck palindrome number
        System.out.println("Reversed Number : " + reversedNumber);

//      it will check reverse and original are same or not
        if (originalNumber == reversedNumber) {

//        print statement that its palindrome
            System.out.println("Number " + originalNumber + " is a palindrome");
        } else {
            System.out.println("Number " + originalNumber + " is not a palindrome");
        }
    }
}