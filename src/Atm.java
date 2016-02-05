import com.sun.tools.javac.comp.Enter;

import java.util.HashMap;
import java.util.Scanner;

//trying something
/**
 * Created by alexanderhughes on 2/3/16.
 */
public class Atm {      //Simple atm mimic which will ask for username and offer balance check and withdrawal options

    public static void main(String[] args) throws Exception {
        while (true) {
            UserAccount account = new UserAccount();    //reatse a new UserAccount object to be used by EnterName and BalMgmt
            EnterName login = new EnterName();
            login.enterName(account);
            BalanceMgmt balanceMgmt = new BalanceMgmt();
            while (true) {
                balanceMgmt.enterSelection(account);
                if (account.selection.equals("4") || account.selection.equals("5"))
                    break;
            }
        }


     //   while (account.selection.equals("4") == false) {}

    }


}




//asks for user name, throws exception if nothing input
//queries what the user wants to do, such as withdraw funds,
//balance inquiry, or cancel transaction