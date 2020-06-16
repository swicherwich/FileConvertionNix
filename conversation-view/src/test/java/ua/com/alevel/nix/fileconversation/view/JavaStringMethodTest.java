package ua.com.alevel.nix.fileconversation.view;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JavaStringMethodTest implements AbstractStringMethodTest {

    @Test
    @Override
    public void frequentlyUsedMethods() {
        String testString = "JavaStringTest";
        char myChar = testString.charAt(2);
        System.out.println("char = " + Character.toString(myChar));
        int unicode = testString.codePointAt(2);
        System.out.println("unicode = " + String.valueOf(unicode));
        int unicodeBefore = testString.codePointBefore(2);
        System.out.println("unicodeBefore = " + String.valueOf(unicodeBefore));

        String compareToString = "JavaStringTest1";
        if (testString.compareTo(compareToString) == 0) {
            System.out.println("String equals");
        } else {
            System.out.println("String not equals. Returned " + testString.compareTo(compareToString));
        }

        String newTestString = testString.concat(" JavaStringTest");
        System.out.println("newTestString = " + String.valueOf(newTestString));

        String containsString = "Java";
        if(testString.contains(containsString)) {
            System.out.println("The string " + testString + " contains " + containsString);
        } else {
            System.out.println("The string " + testString + " not contains " + containsString);
        }
        if(testString.indexOf(containsString) > -1) {
            System.out.println("The string " + testString + " contains " + containsString);
        } else {
            System.out.println("The string " + testString + " not contains " + containsString);
        }

        if(testString.startsWith(containsString)){
            System.out.println("The string " + testString + " startsWith " + containsString);
        } else {
            System.out.println("The string " + testString + " not startsWith " + containsString);
        }

        if(testString.endsWith(containsString)){
            System.out.println("The string " + testString + " endsWith " + containsString);
        } else {
            System.out.println("The string " + testString + " not endsWith " + containsString);
        }

        System.out.println("newTestString before replace = " + newTestString);
        newTestString = newTestString.replace("JavaStringTest", "ScalaStringTest");
        System.out.println("newTestString after replace = " + newTestString);

        newTestString = newTestString.toLowerCase();
        System.out.println("newTestString toLowerCase = " + newTestString);
        newTestString = newTestString.toUpperCase();
        System.out.println("newTestString toUpperCase = " + newTestString);

        newTestString = newTestString.substring(0, newTestString.split(" ")[0].length());
        System.out.println("newTestString substring = " + newTestString);
    }
}
