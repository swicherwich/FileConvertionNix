package ua.com.alevel.nix.fileconversation.util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConversationUtil {

    public static String splitConversation(String file) {
        return Arrays.stream(file.split(" ")).map(s -> s.concat("\n")).collect(Collectors.joining());
    }

    public static String replaceConversation(String file) {
        return file.replaceAll("\\?", "X");
    }
}
