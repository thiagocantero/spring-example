package br.com.thiago.spring_example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
   
    @GetMapping("/teste")
    public String action(ModelMap model){
        model.addAttribute("nome", "Malu");
        return "teste";
    }

    @GetMapping("/teste2")
    public ModelAndView action2(){
        // var modelAdnView = new ModelAndView("teste");
        // modelAdnView.addObject("nome", "Malu");
        // return modelAdnView;

        return new ModelAndView("teste", Map.of("nome", "Malu"));
    }
}
