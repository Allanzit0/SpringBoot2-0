package br.com.aula.projetoestacionamento.PaginaWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClienteWebPrincipal {
    // HomeController.java
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
