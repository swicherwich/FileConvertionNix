package ua.com.alevel.nix.fileconversation.view;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ua.com.alevel.nix.fileconversation.view.util.ApproximateAddressUtil;
import ua.com.alevel.nix.fileconversation.view.util.SpeedStringBuilderAndBufferUtil;

import java.io.IOException;
import java.util.logging.Logger;

@SpringBootTest
public class JavaStringBuilderAndBufferMemoryTest {

    private final static Logger LOGGER = Logger.getLogger(JavaStringBuilderAndBufferMemoryTest.class.getName());

    @Test
    public void initDefaultStringBuilderAndBuffer() {

        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println("stringBuilder value: = " + stringBuilder);
        System.out.println("stringBuilder length: = " + stringBuilder.length());
        System.out.println("stringBuilder capacity: = " + stringBuilder.capacity());
        System.out.println("stringBuilder hashCode: = " + System.identityHashCode(stringBuilder));
        ApproximateAddressUtil.printAddresses("stringBuilder address: = ", stringBuilder);

        System.out.println();

        System.out.println("stringBuffer value: = " + stringBuffer);
        System.out.println("stringBuffer length: = " + stringBuffer.length());
        System.out.println("stringBuffer capacity: = " + stringBuffer.capacity());
        System.out.println("stringBuffer hashCode: = " + System.identityHashCode(stringBuffer));
        ApproximateAddressUtil.printAddresses("stringBuffer address: = ", stringBuffer);

        LOGGER.info("-----------------------------------------------------------------");
    }

    @Test
    public void initStringBuilderAndBuffer() {

        StringBuilder stringBuilder = new StringBuilder("JavaStringTest");
        StringBuffer stringBuffer = new StringBuffer("JavaStringTest");

        System.out.println("stringBuilder value: = " + stringBuilder);
        System.out.println("stringBuilder length: = " + stringBuilder.length());
        System.out.println("stringBuilder capacity: = " + stringBuilder.capacity());
        System.out.println("stringBuilder hashCode: = " + System.identityHashCode(stringBuilder));
        ApproximateAddressUtil.printAddresses("stringBuilder address: = ", stringBuilder);

        System.out.println();

        System.out.println("stringBuffer value: = " + stringBuffer);
        System.out.println("stringBuffer length: = " + stringBuffer.length());
        System.out.println("stringBuffer capacity: = " + stringBuffer.capacity());
        System.out.println("stringBuffer hashCode: = " + System.identityHashCode(stringBuffer));
        ApproximateAddressUtil.printAddresses("stringBuffer address: = ", stringBuffer);

        LOGGER.info("--------------------------------INIT CAPACITY 16 ---------------------------------");

        stringBuilder = new StringBuilder(16);
        stringBuilder.append("JavaStringTest");
        System.out.println("stringBuilder value: = " + stringBuilder);
        System.out.println("stringBuilder length: = " + stringBuilder.length());
        System.out.println("stringBuilder capacity: = " + stringBuilder.capacity());
        System.out.println("stringBuilder hashCode: = " + System.identityHashCode(stringBuilder));
        ApproximateAddressUtil.printAddresses("stringBuilder address: = ", stringBuilder);

        LOGGER.info("--------------------------------INIT CAPACITY 13 ---------------------------------");

        stringBuilder = new StringBuilder(13);
        stringBuilder.append("JavaStringTest");
        System.out.println("stringBuilder value: = " + stringBuilder);
        System.out.println("stringBuilder length: = " + stringBuilder.length());
        System.out.println("stringBuilder capacity: = " + stringBuilder.capacity());
        System.out.println("stringBuilder hashCode: = " + System.identityHashCode(stringBuilder));
        ApproximateAddressUtil.printAddresses("stringBuilder address: = ", stringBuilder);
    }

    @Test
    public void speedTestStringBuilderAndBuffer() {
        try {
            SpeedStringBuilderAndBufferUtil.run(new StringBuffer(""));
            SpeedStringBuilderAndBufferUtil.run(new StringBuilder(""));
        } catch (IOException e) {
            LOGGER.severe("failed speed test: " + e.getMessage());
        }
    }
}
