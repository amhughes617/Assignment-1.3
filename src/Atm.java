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
        userInput.enterName();
        userInput.enterSelection();
    }
}

