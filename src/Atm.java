import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

//trying something
/**
 * Created by alexanderhughes on 2/3/16.
 */
public class Atm {      //Simple atm mimic which will ask for username and offer balance check and withdrawal options
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        UserInput userInput = new UserInput();
        userInput.enterName();                  //asks for user name, throws exception if nothing input
        userInput.enterSelection();             //queries what the user wants to do, such as withdraw funds,
    }                                           //balance inquiry, or cancel transaction
}

