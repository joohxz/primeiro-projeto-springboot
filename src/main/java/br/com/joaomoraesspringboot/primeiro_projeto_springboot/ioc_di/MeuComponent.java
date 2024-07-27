package br.com.joaomoraesspringboot.primeiro_projeto_springboot.ioc_di;

import org.springframework.stereotype.Service;

//Bin é gerado e controlado pelo container IOC
@Service //Scan/Anotation para os serviços feitos pelo Spring
public class MeuComponent {
    public String chamarMeuComponent(){
        return "Meu Component";
    }
}
