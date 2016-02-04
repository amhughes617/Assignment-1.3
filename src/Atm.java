import java.util.HashMap;
import java.util.Scanner;

//trying something
/**
 * Created by alexanderhughes on 2/3/16.
 */
public class Atm {      //Simple atm mimic which will ask for username and offer balance check and withdrawal options
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        UserAccount account = new UserAccount();
        while (true) {
            account.enterName();
            while (true) {
                account.enterSelection();
                if (account.selection.equals("4"))
                    break;
            }
        }


     //   while (account.selection.equals("4") == false) {}

    }


}




//asks for user name, throws exception if nothing input
//queries what the user wants to do, such as withdraw funds,
//balance inquiry, or cancel transaction