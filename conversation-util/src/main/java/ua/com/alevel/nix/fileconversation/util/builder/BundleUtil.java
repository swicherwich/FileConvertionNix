package ua.com.alevel.nix.fileconversation.util.builder;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BundleUtil {
	private static final ResourceBundle RESOURCE_ACCOUNTS = ResourceBundle.getBundle("grammarstuff");
	
	public static Map<String, String> getBundleProperties() {
		return convertResourceBundleToMap();
	}
	
	private static Map<String, String> convertResourceBundleToMap() {
		Map<String, String> map = new HashMap<String, String>();
		Enumeration<String> keys = BundleUtil.RESOURCE_ACCOUNTS.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			map.put(key, BundleUtil.RESOURCE_ACCOUNTS.getString(key));
		}
		return map;
	}
}
