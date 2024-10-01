import java.util.Scanner; // import the scanner class

public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      System.out.println("Testing methods that RETURN values...");

      // Construct a Scanner object
      // note: System.in() is the computer's keyboard
      Scanner scan = new Scanner(System.in);
      /* 
      // Take input with the Scanner methods
      System.out.println("Enter some text: ");
      String inputStr = scan.nextLine();
      System.out.println("Enter a whole number: ");
      int inputInt = scan.nextInt();
      System.out.println("Enter a decimal number: ");
      double inputDouble = scan.nextDouble();

      // Handle the user input (do something with the values)
      // Use it in a print statement
      System.out.println("You entered: " + inputStr);
      // Use values in an expression
      double sum = inputInt + inputDouble;
      */
      //***STRING CLASS***
      // Original way of constructing a String object
      String message = new String("APCS is awesome!");
      // Shortcut (common) way of creating a String
      String greeting = "Hello coders!"; // text in quote is a "String Literal"

      // Concatenate (combine) two or more String objects
      String concatenated = greeting + message;
      System.out.println(concatenated);
      System.out.println(greeting + " " + message);
      // can combine String variables AND "String Literals"

      // Numbers get converted to a String here
      System.out.println("I am " + 16 + " years old");
      System.out.println("12" + 4 + 3); //1243
      System.out.println("12" + (4 + 3)); //127
      System.out.println(("12") + 4 + 3); // 1243
      System.out.println(12 + 4 + 3); // NOT concatenation, just addition

      // *** STRING METHODS ***
      // .length() returns number of characters
      int messageLength = message.length();
      System.out.println("Length: " + messageLength);
      // .length()-1 represents final index
      System.out.println("Final Index: " + (message.length()-1));

      // Use index to access character(s)
      // .substring(int, int) return a String from first index to second
      // not including the char at the second int index
      String firstWord = message.substring(0,3);
      System.out.println(firstWord);

   }
}
