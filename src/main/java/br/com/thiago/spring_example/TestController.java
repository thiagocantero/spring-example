package br.com.thiago.spring_example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
     * @return
     */
    @GetMapping("/teste3")
    public String action3(){
        Model.addAttribute("client", new Client("Thiago", 42));
        return "form";
    }

    @PostMapping("/teste3")
    public String action4(Client client) {
        System.out.println(client);
        return "form";
    }
   

}
