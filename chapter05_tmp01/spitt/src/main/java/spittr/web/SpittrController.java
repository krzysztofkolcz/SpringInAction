package spittr.web;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import spittr.model.Spittle;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittr")
public class SpittrController {
    @RequestMapping(method=RequestMethod.GET)
    public String spittr(Model model) {
        model.addAttribute("test","yo yo yo");
        return "spittr";
    }
}
