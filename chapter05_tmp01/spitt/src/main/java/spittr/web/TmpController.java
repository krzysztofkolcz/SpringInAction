package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
import java.io.InputStream;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping({"/tmp"})
public class TmpController{ 

  @RequestMapping({"/inputstream"})
  public String inputStream(InputStream is,Model model) {
    model.addAttribute("input", is);
    return "tmp/inputStream";
  }

  @RequestMapping({"/matrix/{matrix}"})
  public String matrix( @MatrixVariable Map<String,String> matrix , Model model){
      model.addAttribute("matrix",matrix);
      return "tmp/allParams";
  }

  /*  GET /owners/42;q=11;r=12/pets/21;q=22;s=23 */
  @RequestMapping(value = "/owners/{ownerId}/pets/{petId}", method = RequestMethod.GET)
  public String findPet(
      @MatrixVariable Map<String, String> matrixVars, 
      @MatrixVariable(pathVar="petId") Map<String, String> petMatrixVars,
      Model model) {    
      model.addAttribute("matrix1",petMatrixVars);
      model.addAttribute("matrix2",matrixVars.toString());
      return "tmp/allParams";
  }

  @RequestMapping({"/input/{inputId}"})
  public String allParams(@PathVariable String inputId, Model model){
      model.addAttribute("inputId",inputId);
      return "tmp/allParams";
    }

    /*
    @RequestHeader(value="User-Agent") String reqHeader,
    @RequestBody String reqBody,
    @RequestPart String reqPart,
    org.springframework.web.context.request.WebRequest webrequest,
    java.util.Locale locale,
    java.util.TimeZone timezone,
    java.io.InputStream inputstream,
    java.io.OutputStream outputstream,
    org.springframework.http.HttpMethod httpmethod,
    java.security.Principal principal,
    @RequestParam("reqParam") String reqParam,
    @MatrixVariable Map<String,String> matrix,
    HttpEntity<?> 
    java.util.Map / org.springframework.ui.Model / org.springframework.ui.ModelMap 
    org.springframework.web.servlet.mvc.support.RedirectAttributes 
    Command @InitBinder 
    org.springframework.validation.Errors / org.springframework.validation.BindingResult 
    org.springframework.web.bind.support.SessionStatus @SessionAttributes 
    org.springframework.web.util.UriComponentsBuilder 
    */



    /*
    model.addAttribute("webrequest",webrequest);
    model.addAttribute("locale",locale);
    model.addAttribute("timezone",timezone);
    model.addAttribute("inputstream",inputstream);
    model.addAttribute("outputstream", outputstream);
    model.addAttribute("httpmethod",httpmethod);
    model.addAttribute("principal",principal);
    model.addAttribute("matrix",matrix);
    model.addAttribute("reqParam",reqParam);
    model.addAttribute("reqHeader",reqHeader);
    model.addAttribute("reqBody",reqBody);
    model.addAttribute("reqPart",reqPart); 
    */
}
