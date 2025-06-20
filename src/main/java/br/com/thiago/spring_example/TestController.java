package br.com.thiago.spring_example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;




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

    /**
     * @param model 
     * @return
     */
    @GetMapping("/teste3")
    public String action3(ModelMap model2){
        model2.addAttribute("Client", new Client("Thiago", 42));
        return "form";
    }

    @PostMapping("/teste3")
    public String action4(Client client) {
        System.out.println(client);
        return "form";
    }
   

}
