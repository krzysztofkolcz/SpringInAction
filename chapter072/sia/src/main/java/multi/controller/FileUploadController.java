package multi.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
 

@Controller
public class FileUploadController{

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String showUploadForm() {
        return "fileUploader";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String processUploadFile(
        @RequestPart("profilePicture") byte[] profilePicture) {
        profilePicture.transferTo( new File("/var/www/destination" + profilePicture.getOriginalFilename()));
        return "fileUploader";
    }
}
