package ua.com.alevel.nix.fileconversation.util;

import ua.com.alevel.nix.fileconversation.util.builder.DataBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ConversationUtil {
	
	
	public static String splitConversation(String file) {
		return Arrays.stream(file.split(" ")).map(s -> s.concat("\n")).collect(Collectors.joining());
	}
	
	public static String replaceConversation(String file) {
		return file.replaceAll("\\?", "X");
	}
    
    private static String getRoot(String word) {
	    DataBuilder dataBuilder = new DataBuilder();
	    dataBuilder.buildDataList();
	    WordUtil wordUtil = dataBuilder.getWordUtil();
	    
		if(wordUtil.hasPrefix(word)) {
			if(word.split(wordUtil.getCurrentPrefix(word)).length > 0) {
				word = word.split(wordUtil.getCurrentPrefix(word))[1];
			}
		} else {
			if(wordUtil.hasSuffix(word)) {
				word = word.split(wordUtil.getCurrentSuffix(word))[0];
			}
		}
		
	    return word;
    }
    
    public static String rootsConversation(String file) {
		String[] words = file.split("\\W+");
		
	    HashMap<String, Integer> rootsCount = new HashMap<>();

	    for(String word: words) {
	    	String root = getRoot(word.toLowerCase());
	    	if(rootsCount.get(root) == null) {
	    		rootsCount.put(root, 1);
		    } else {
	    		Integer oldValue = rootsCount.get(root);
	    		rootsCount.replace(root, oldValue, oldValue+1);
		    }
	    }
	    
	    return rootsCount.toString()
			    .replaceAll(", ", "\n")
			    .replaceAll("\\{", " ")
			    .replaceAll("}", " ");
    }
}
