package br.com.thiago.spring_example;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;




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
    public String action3(Model model){
        model.addAttribute("Client", new Client("Thiago", 42));
        return "form";
    }

    @PostMapping("/teste3")
    public String action4(@ModelAttribute("client") Client client) {
        System.out.println(client);
        return "form";
    }
   
    @GetMapping("/teste5")
    public String action5(@RequestParam(name ="q", required = false, defaultValue = "Malu") 
    String busca,
    @RequestParam int age,
    @RequestParam List<String> skills
    ){
        System.out.println(busca);
        System.out.println(age);
        System.out.println(skills);
        return "teste";
    }

    @GetMapping("/teste6/{id}")
    public String action6(@PathVariable Long id){
        System.out.println(id);
        return "teste";
        }
    }
    


