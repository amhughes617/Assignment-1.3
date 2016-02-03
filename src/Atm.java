import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
//trying something
/**
 * Created by alexanderhughes on 2/3/16.
 */
public class Atm {      //Simple atm mimic which will ask for username and offer balance check and withdrawal options
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        if(name.isEmpty()) {
            throw new Exception("User must enter a name.");
        }
        System.out.println("Welcome " + name);


        System.out.println("Would you like to [Check Balance/Withdraw Funds/Cancel Transaction]");
        String selection = scanner.nextLine();

        if(selection.equalsIgnoreCase("Check Balance")) {
            System.out.println("Your balance is $100.");
        }
        else if(selection.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("How much much money would you like to withdraw?");
            String howMuch = scanner.nextLine();
            int howMuchInt = Integer.valueOf(howMuch);
            if(howMuchInt > 100) {
                throw new Exception("Insufficient funds!");
            }
            System.out.println("Please take your money.");
        }
        else if(selection.equalsIgnoreCase("Cancel Transaction")) {
            System.out.println("Thank you please come again.");
        }
        else {
            throw new Exception("Invalid Response!");
        }
    }
}

