package ua.com.alevel.nix.fileconversation.view;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

@SpringBootTest
public class SpringStringMethodTest implements AbstractStringMethodTest {

    @Test
    @Override
    public void frequentlyUsedMethods() {

        String stringTest = "Java String Test";

        if (StringUtils.containsWhitespace(stringTest)) {
            System.out.println("stringTest contains whitespace");
        } else {
            System.out.println("stringTest not contains whitespace");
        }

        if (StringUtils.startsWithIgnoreCase(stringTest, "JAVA")) {
            System.out.println("stringTest starts with ignoreCase");
        } else {
            System.out.println("stringTest not starts with ignoreCase");
        }

        String stringDeleteTest = StringUtils.deleteAny(stringTest, "str");
        System.out.println("stringDeleteTest = " + stringDeleteTest);
    }
}
