package spittr.web;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import spittr.Spitter;
import spittr.data.SpitterRepository;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value="/register", method=GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }


    @RequestMapping(value="/{username}", method=GET)
    public String showSpitterProfile(
    @PathVariable String username, Model model) {
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }

    @RequestMapping(value="/register", method=POST)
    public String processRegistration( @Valid Spitter spitter, Errors errors) {
        System.out.println(spitter.getUsername());
        System.out.println("yo yo yo");
        if (errors.hasErrors()) {
            System.out.println("Errors");
            for(ObjectError e : errors.getAllErrors()){
                System.out.println(e);
            }
            return "registerForm";
        }
        spitterRepository.save(spitter);
        System.out.println("redirect:/spitter/" + spitter.getUsername());
        return "redirect:/spitter/" + spitter.getUsername();
    }
}
