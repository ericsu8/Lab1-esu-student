package hw;

import java.util.Arrays;

public class Main {

  public static void main(final String[] args) {
    int max = 0;
    if (args.length > 0) {
        try {
            max = Integer.parseInt(args[0]);
        }
    catch (NumberFormatException e) {
            System.err.println("The argument entered must be an integer ");
    //In our case, you can use
            System.exit(1);
        }
    }
    //fizzbuzz logic

  }
}

