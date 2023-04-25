package com.miPortfolio.ProyectoPortfolio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {
                        //coincide con
    @GetMapping ("/hola/{nombre}")               //este
    public String holaMundo(@PathVariable String nombre){
        return "Hola Mundo " + nombre;
    }
    
}
