package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/form"})
public class FormController{
  @RequestMapping({"/form/one"})
  public String formOne(){
    return "form/one";
  }
}
