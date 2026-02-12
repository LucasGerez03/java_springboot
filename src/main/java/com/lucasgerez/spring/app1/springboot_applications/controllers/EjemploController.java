package com.lucasgerez.spring.app1.springboot_applications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {
    
    @GetMapping("/detalles_info")
    
    
    public String info(Map<String, Object> model){

        model.put("Titulo", "Servidor en Linea!!");
        model.put("Servidor", "Este Servdor es de Lucas :D");
        model.put("Ip", "192.168.1.1");
        
        return "detalles_info";
    
    } 
}
