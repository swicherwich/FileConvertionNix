package ua.com.alevel.nix.fileconversation.view;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApacheStringMethodTest implements AbstractStringMethodTest {

    @Test
    @Override
    public void frequentlyUsedMethods() {
        String stringTest = "JavaStringTest";

        if (StringUtils.isNotBlank(stringTest)) {
            System.out.println("stringTest is not blank");
        } else {
            System.out.println("stringTest is blank");
        }
        if (StringUtils.isNotEmpty(stringTest)) {
            System.out.println("stringTest is not empty");
        } else {
            System.out.println("stringTest is empty");
        }

        String stringNumericTest = "1r";
        if (StringUtils.isNumeric(stringNumericTest)) {
            System.out.println("stringNumericTest is numeric");
        } else {
            System.out.println("stringNumericTest is not numeric");
        }

        String stringWhitespaceTest = " ";
        if (StringUtils.isWhitespace(stringWhitespaceTest)) {
            System.out.println("stringWhitespaceTest is whitespace");
        } else {
            System.out.println("stringWhitespaceTest is not whitespace");
        }

        String stringJoinWithTest = StringUtils.joinWith(stringTest, "-", "-");
        System.out.println("stringJoinWithTest = " + stringJoinWithTest);
    }
}
