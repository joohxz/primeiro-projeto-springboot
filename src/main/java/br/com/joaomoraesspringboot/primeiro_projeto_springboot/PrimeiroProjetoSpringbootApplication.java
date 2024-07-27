package br.com.joaomoraesspringboot.primeiro_projeto_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //Aplicação do Spring Boot
@ComponentScan(basePackages= "br.com.joaomoraesspringboot") //Verificar os componentes desse diretório
public class PrimeiroProjetoSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeiroProjetoSpringbootApplication.class, args);
    }

}
