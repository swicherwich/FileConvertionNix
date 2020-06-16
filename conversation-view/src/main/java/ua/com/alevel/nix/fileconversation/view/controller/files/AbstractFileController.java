package ua.com.alevel.nix.fileconversation.view.controller.files;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ua.com.alevel.nix.fileconversation.view.config.ConversationType;

public abstract class AbstractFileController extends AbstractController {

    protected abstract String getAllFiles(Model model);

    protected abstract ResponseEntity<Resource> serveFile(String filename);

    protected abstract String deleteFile(String filename);

    protected abstract String handleFileUpload(MultipartFile file, ConversationType conversationType, RedirectAttributes redirectAttributes);
}
