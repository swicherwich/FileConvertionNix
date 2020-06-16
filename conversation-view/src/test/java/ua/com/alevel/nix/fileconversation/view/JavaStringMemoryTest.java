package ua.com.alevel.nix.fileconversation.view;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ua.com.alevel.nix.fileconversation.view.util.ApproximateAddressUtil;

import java.util.logging.Logger;

@SpringBootTest
public class JavaStringMemoryTest {

    private final static Logger LOGGER = Logger.getLogger(JavaStringMemoryTest.class.getName());

    @Test
    public void initString() {
        String stringTest = "JavaStringTest";

        System.out.println("stringTest value: = " + stringTest);
        System.out.println("stringTest length: = " + stringTest.length());
        System.out.println("stringTest hashCode: = " + System.identityHashCode(stringTest));
        ApproximateAddressUtil.printAddresses("stringTest address: = ", stringTest);

        LOGGER.info("-----------------------------------------------------------------");

        String stringTest2 = "JavaStringTest";

        System.out.println("stringTest2 value: = " + stringTest2);
        System.out.println("stringTest2 length: = " + stringTest2.length());
        System.out.println("stringTest2 hashCode: = " + System.identityHashCode(stringTest2));
        ApproximateAddressUtil.printAddresses("stringTest2 address: = ", stringTest2);

        LOGGER.info("-----------------------------------------------------------------");

        String stringTest3 = "JavaStringTest3";

        System.out.println("stringTest3 value: = " + stringTest3);
        System.out.println("stringTest3 length: = " + stringTest3.length());
        System.out.println("stringTest3 hashCode: = " + System.identityHashCode(stringTest3));
        ApproximateAddressUtil.printAddresses("stringTest3 address: = ", stringTest3);

        LOGGER.info("-----------------------------------------------------------------");

        char[] stringTestArray = { 'J','a','v','a','S','t','r','i','n','g','T','e','s','t' };
        String stringTest4 = new String(stringTestArray);

        System.out.println("stringTest4 value: = " + stringTest4);
        System.out.println("stringTest4 length: = " + stringTest4.length());
        System.out.println("stringTest4 hashCode: = " + System.identityHashCode(stringTest4));
        ApproximateAddressUtil.printAddresses("stringTest4 address: = ", stringTest4);

        LOGGER.info("-----------------------------------------------------------------");

        String stringTest5 = "JavaStringTest";

        System.out.println("stringTest5 value: = " + stringTest5);
        System.out.println("stringTest5 length: = " + stringTest5.length());
        System.out.println("stringTest5 hashCode: = " + System.identityHashCode(stringTest5));
        ApproximateAddressUtil.printAddresses("stringTest5 address: = ", stringTest5);

        LOGGER.info("-----------------------------------------------------------------");

        String stringTest6 = new String(stringTestArray, 0, 4);

        System.out.println("stringTest6 value: = " + stringTest6);
        System.out.println("stringTest6 length: = " + stringTest6.length());
        System.out.println("stringTest6 hashCode: = " + System.identityHashCode(stringTest6));
        ApproximateAddressUtil.printAddresses("stringTest6 address: = ", stringTest6);
    }
}
