package com.miPortfolio.ProyectoPortfolio.Controller;

import java.util.ArrayList;
import java.util.List;
import model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class Controller {
    
    List<Persona> listaPersonas = new ArrayList();
    
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
    public String holaMundo(@PathVariable String nombre,
            @PathVariable String apellido,
            @PathVariable int edad){
        return "Hola:  " + nombre + " apellido: " + apellido + " edad: " + edad;
    }
    
    @GetMapping ("/chau")
    public String decirChau(@RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam int edad){
        return "Chau:  " + nombre + " apellido: " + apellido + " edad: " + edad;
    }
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        listaPersonas.add(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return listaPersonas;
    }
}
