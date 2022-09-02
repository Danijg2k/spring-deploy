package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    Ambas propiedades/atributos leen variables de los archivos properties, mediante ${}

    @Value("${app.message}")
    String message;

//    @Value("${app.varexample}")
//    String varEntorno;

    @GetMapping("/message")
    public String message(){
        System.out.println(message);
        return message;
    }

//    @GetMapping("/entorno")
//    public String entorno(){
//        System.out.println(varEntorno);
//        return varEntorno;
//    }

}
