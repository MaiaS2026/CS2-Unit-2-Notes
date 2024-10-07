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
      String firstWord = message.substring(0,4);
      System.out.println(firstWord);

      // .substring(int) returns a String from first index to end of string
      String lastWord = message.substring(8);
      System.out.println(lastWord);

      // .indexOf(String) returns an int representing the index
      // or position of the String argument passed in
      int indexOfAwesome = message.indexOf("awesome");
      System.out.println(indexOfAwesome);

      // not on AP exam but useful
      System.out.println(message.toUpperCase());
      System.out.println(message.toLowerCase());

      // .equals compares a parameter String to the calling String object
      // then returns a boolena representing whether they are EQUAL
      String s1 = "I am tired.";
      String s2 = "It is almost the weekend!";

      boolean isEqual = s1.equals(s2);
      System.out.println(isEqual);
      boolean isEqualAgain = s1.equals("I am tired.");
      System.out.println(isEqualAgain);

      String a = "ape";
      String z = "zebra";

      // .compareTo returns a positive integer if this string > other than other string
      // returns a negative integer if this string is < other string
      System.out.println(a.compareTo(z)); //-25
      System.out.println(z.compareTo(a)); // 25

      // *** MATH CLASS METHODS ***
      // Do NOT need to construct a Math OBJECT to use

      int absVal = Math.abs(-273);
      System.out.println(absVal);

      double absValDoub = Math.abs(-2.5);
      System.out.println(absValDoub);

      // Math.pow(double, double) return the first double raised to the power of the second double provided
      double cubed = Math.pow(38, 3);
      System.out.println(cubed); // 54872.0

      // Math.sqrt(double) returns the square root of the input
      double squareRoot = Math.sqrt(49);
      System.out.println(squareRoot);

      // Math.random() returns a random double
      System.out.println("Random number: " + Math.random());

      // Modify the range of output from Math.random
      // Multiply output to increase endpoint of range
      double rand = Math.random() * 100;
      System.out.println(rand);
      // ADD to output to increase starting point
      double rand2 = Math.random() * 100 + 1;
      System.out.println(rand2);

      // Cast to an int if you want a random whole number
      int randInt = (int) (Math.random() * 10 + 1); 
      System.out.println(randInt);

   }
}
