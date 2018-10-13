/*
 * Regex CNP valid
 */
package cnp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Michaela
 */
public class Cnp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String regex = "^([1|2])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])([0-9]{1}[0-9]{1}[0-9]{1}[0-9]{1})([0-9]{4})$";
//        System.out.println("This is a CNP: 1010719906569");
        Pattern pattern = Pattern.compile(regex);

        Scanner cnpScanner = new Scanner(System.in);
        System.out.println("Insert cnp that should be checked: ");
        // read the regular expresion
        String cnp = cnpScanner.nextLine();

        Matcher matcher = pattern.matcher(cnp);

        int matchCount = 0;
        boolean found = false;
        while (matcher.find()) {
            matchCount++;
            System.out.printf("Match count: %s, CNP: '%s'%n", matchCount, matcher.group());
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.printf("Capture Group Number: %s, Captured Text: '%s'%n", i, matcher.group(i));
            }
            found = true;
        }

        // if regular expression  was not found in the pattern
        if (!found) {
            System.out.println("This is not a valid CNP");
        }
    }

}
