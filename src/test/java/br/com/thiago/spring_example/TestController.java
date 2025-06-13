package br.com.thiago.spring_example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
   
    @GetMapping("/Teste")
    public String action(){
        System.out.println("Olá, Malu");
        return "Malu";
    }
}
