package ua.com.alevel.nix.fileconversation.util;

import java.util.List;

public class WordUtil {
	private List<String> prefixes;
	private List<String> suffixes;
	
	private String currentSuffix = null;
	private String currentPrefix = null;
	
	public void setPrefixes(List<String> prefixes) {
		this.prefixes = prefixes;
	}
	public void setSuffixes(List<String> suffixes) {
		this.suffixes = suffixes;
	}
	
	public String getCurrentPrefix(String word) {
		if(hasPrefix(word)) return currentPrefix;
		return null;
	}
	
	public String getCurrentSuffix(String word) {
		if(hasSuffix(word)) return currentSuffix;
		return null;
	}
	
	public boolean hasPrefix(String word) {
		for(String prefix: prefixes) {
			if(word.startsWith(prefix)) {
				this.currentPrefix = prefix;
				return true;
			}
		}
		return false;
	}
	
	public boolean hasSuffix(String word) { ;
		for(String suffix: suffixes) {
			if(word.contains(suffix)) {
				this.currentSuffix = suffix;
				return true;
			}
		}
		return false;
	}
}
