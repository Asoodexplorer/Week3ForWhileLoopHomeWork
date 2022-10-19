import java.util.Scanner;

public class MultiplyGivenNumber

{
    public static void main(String args[])
    {
// enter a number
        System.out.println("Enter your Desired Number : ");
// creating object
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
// for loop method
        for(int i=1; i<= 10; i++) {
// here you go the answer taddaaaaaaaaaaaa
        System.out.println(""+num+" X "+i+" = "+(num*i));
        }
    }
}

