package br.com.joaomoraesspringboot.primeiro_projeto_springboot.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/component")
public class MeuControllerComponent {
    
    //Injeção de IOC feita pelo Spring Boot
    //Bin
    @Autowired
    MeuComponent meuComponent;

    @GetMapping("/")
    public String chamarMeuComponent() {
    
        var resultado = meuComponent.chamarMeuComponent();
        return resultado;
    }
    
}
