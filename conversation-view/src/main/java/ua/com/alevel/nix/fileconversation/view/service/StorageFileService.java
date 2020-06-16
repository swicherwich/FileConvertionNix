package ua.com.alevel.nix.fileconversation.view.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import ua.com.alevel.nix.fileconversation.view.config.ConversationType;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageFileService {

    void init();

    void store(MultipartFile file, ConversationType conversationType);

    Stream<Path> loadAll(ConversationType conversationType);

    Path load(String filename, ConversationType conversationType);

    Resource loadAsResource(String filename, ConversationType conversationType);

    void deleteAll();

    void delete(String filename, ConversationType conversationType);
}
