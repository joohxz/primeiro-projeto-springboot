package br.com.joaomoraesspringboot.primeiro_projeto_springboot.Controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController //Define o RestController
@RequestMapping("/primeiraController") //Chama a controller
public class PrimeiraController {

    //Define o primeiro método
    @GetMapping("/primeiroMetodo/{id}") //Pedindo o parametro depois do /
    public String primeiroMetodoString(@PathVariable String id) {
        return "O parâmetro alocado foi: " + id;
    }

    //Request Parametro
    @GetMapping("/metodoComQueryParams") //Coloca o parametro com ?id=
    public String metodoComQueryParams(@RequestParam String id) {
        return "O metodo com QueryParams é:" + id;
    }
    
    //Parâmetro Query
    @GetMapping("/metodoComQueryParams2") // id=14&JoaozinhoTestando
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        return "O metodo com QueryParams2 é:" + allParams;
    }
    

    //Parâmetro Body
    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParam(@RequestBody User usuario){
        return "metodoComBodyParams " + usuario.username;
    }

    //Classe simples para chamada no patrâmetro body
    record User(String username) {
    }

    //Parâmetro Header
    @PostMapping("/metodoComHeaderParams")
    public String metodoComHeaderParams(@RequestHeader("name") String name) {
        //TODO: process POST request
        return "Método com Headers " + name;
    }
    
    @PostMapping("/metodoComListHeader")
    public String metodoComListHeader(@RequestBody Map<String, String> headersMap) {
        //TODO: process POST request
        return "Método com List Headers " + headersMap.entrySet();
    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id) {
        var usuario = new User("Joao");
        if(id > 5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        } else {
            return ResponseEntity.badRequest().body("ID menor que 5");
        }
    }
    
    
}
