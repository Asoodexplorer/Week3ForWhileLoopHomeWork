import java.util.Scanner;

public class NumbersDevidedBy3And5Seperately {
    public static void main(String args[]) {

        // no need to create object as they as asked to print between 1 to 100
        // here it will divide by 3
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
// here it will divided by 5
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }
// here it will go to divide by both 3 and 5
        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
        }
        //print n number
        System.out.println("\n");
    }
}