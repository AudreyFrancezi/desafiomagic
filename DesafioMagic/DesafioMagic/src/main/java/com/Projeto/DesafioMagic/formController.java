package com.Projeto.DesafioMagic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class formController {
    @RequestMapping("/CadastroCartas")
    public String form(){
        return "templates/formCartas";
    }
}
