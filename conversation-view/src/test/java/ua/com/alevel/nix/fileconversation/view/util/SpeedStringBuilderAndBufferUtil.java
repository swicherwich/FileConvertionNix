package ua.com.alevel.nix.fileconversation.view.util;

public class SpeedStringBuilderAndBufferUtil {

    public static void run(Appendable obj) throws java.io.IOException {
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < Integer.MAX_VALUE; ) {
            obj.append("");
        }
        long after = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }
}
