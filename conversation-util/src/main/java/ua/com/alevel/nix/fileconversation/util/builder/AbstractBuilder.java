package ua.com.alevel.nix.fileconversation.util.builder;

import java.util.Map;

public interface AbstractBuilder {
	default Map<String, String> getKeyValueMapByBundleProperties() {
		return BundleUtil.getBundleProperties();
	}
	
	void buildDataList();
}
