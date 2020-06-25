package ua.com.alevel.nix.fileconversation.util.builder;

import ua.com.alevel.nix.fileconversation.util.WordUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DataBuilder implements AbstractBuilder{

	private final WordUtil wordUtil = new WordUtil();
	
	@Override
	public void buildDataList() {
		for(Map.Entry<String, String> entry: getKeyValueMapByBundleProperties().entrySet()) {
			if(entry.getKey().equals("prefixes")) wordUtil.setPrefixes(new ArrayList<String>(Arrays.asList(entry.getValue().split(";"))));
			if(entry.getKey().equals("suffixes"))wordUtil.setSuffixes(new ArrayList<String>(Arrays.asList(entry.getValue().split(";"))));
		}
	}
	
	public WordUtil getWordUtil() { return wordUtil; }
}
