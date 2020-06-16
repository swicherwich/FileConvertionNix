package ua.com.alevel.nix.fileconversation.view.controller.files;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ua.com.alevel.nix.fileconversation.view.config.ConversationType;
import ua.com.alevel.nix.fileconversation.view.data.FileData;
import ua.com.alevel.nix.fileconversation.view.exception.StorageFileNotFoundException;
import ua.com.alevel.nix.fileconversation.view.service.StorageFileService;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/identity_files")
public class IdentityFileController extends AbstractFileController {

    private final StorageFileService storageFileService;

    public IdentityFileController(StorageFileService storageFileService) {
        this.storageFileService = storageFileService;
    }

    @Override
    @GetMapping
    protected String getAllFiles(Model model) {
        model.addAttribute("files", storageFileService.loadAll(ConversationType.IDENTITY)
                .map(path -> new FileData(path, ConversationType.IDENTITY))
                .collect(Collectors.toList()));
        return "page/files/identity_files";
    }

    @Override
    @GetMapping("/files/{filename:.+}")
    protected @ResponseBody ResponseEntity<Resource> serveFile(@PathVariable String filename) {
        Resource file = storageFileService.loadAsResource(filename, ConversationType.IDENTITY);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @Override
    @GetMapping("/files/delete/{filename}")
    protected String deleteFile(@PathVariable String filename) {
        storageFileService.delete(filename, ConversationType.IDENTITY);
        return "redirect:/identity_files";
    }

    @Override
    @PostMapping
    protected String handleFileUpload(
            @RequestParam("file") MultipartFile file,
            @ModelAttribute ConversationType conversationType,
            RedirectAttributes redirectAttributes) {
        storageFileService.store(file, conversationType);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");
        return "redirect:/identity_files";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
}
