package com.miPortfolio.ProyectoPortfolio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
                        
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
    public String holaMundo(@PathVariable String nombre,
            @PathVariable String apellido,
            @PathVariable String edad){
        return "Hola:  " + nombre + " apellido: " + apellido + " edad: " + edad;
    }
    
    @GetMapping ("/chau")
    public String decirChau(@RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam String edad){
        return "Chau:  " + nombre + " apellido: " + apellido + " edad: " + edad;
    }
    
}
