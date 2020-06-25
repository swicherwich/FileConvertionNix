package ua.com.alevel.nix.fileconversation.view.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    private String locationIdentityDir = "identity-dir";
    private String locationSplitDir = "split-dir";
    private String locationReplaceDir = "replace-dir";
    private String locationRootsDir = "roots-dir";

    public String getLocationIdentityDir() {
        return locationIdentityDir;
    }

    public void setLocationIdentityDir(String locationIdentityDir) {
        this.locationIdentityDir = locationIdentityDir;
    }

    public String getLocationSplitDir() {
        return locationSplitDir;
    }

    public void setLocationSplitDir(String locationSplitDir) {
        this.locationSplitDir = locationSplitDir;
    }

    public String getLocationReplaceDir() {
        return locationReplaceDir;
    }

    public void setLocationReplaceDir(String locationReplaceDir) {
        this.locationReplaceDir = locationReplaceDir;
    }
	
	public String getLocationRootsDir() {
		return locationRootsDir;
	}
	
	public void setLocationRootsDir(String locationRootsDir) {
		this.locationRootsDir = locationRootsDir;
	}
}
