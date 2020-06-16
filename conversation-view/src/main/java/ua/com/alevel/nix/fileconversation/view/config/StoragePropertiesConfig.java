package ua.com.alevel.nix.fileconversation.view.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.com.alevel.nix.fileconversation.view.service.StorageFileService;

@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class StoragePropertiesConfig {

    @Bean
    CommandLineRunner init(StorageFileService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
