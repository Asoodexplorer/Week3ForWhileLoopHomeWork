public class StringCoutNumbersOfA

{


        public static void main(String args[])
        {
        String name = "There is a table in the Market which is a good table";
        String word = "a";
        String temp[] = name.split(" ");
        int count = 0;
        //for Loop method
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count++;
        }
        System.out.println("The name is: " + name);
        System.out.println("This given (A) " + word + " appears " + count + " times.");
    }


}
