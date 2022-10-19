import java.util.Scanner;

public class SequenceForFibonacciSeries
{
    public static void main(String[] args) {

        System.out.println("Please enter the number of Fibonacci numbers you want to print as numbers: ");

        // create an instance of the Scanner class to take an input from the user
        int a = 1, b = 1, c, i, adet = new Scanner(System.in ).nextInt();

        // show a prompt to the user to input the number
        System.out.println(adet + " Number of Fibonacci units; ");

        // calculate the next terms in the series using a loop

        if (adet >= 2){
            System.out.println(a + " " + b + " ");

        } else if (adet == 1) {
            System.out.println(a);

        }else if (adet <= 0 ){

        }

        for (i = 3; i<=adet; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c + " ");
        }
    }


}
