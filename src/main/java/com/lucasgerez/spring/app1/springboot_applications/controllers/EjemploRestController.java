package com.lucasgerez.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")

public class EjemploRestController {
    
    @GetMapping(path = "/detalles_info2")
    // @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    
    
    public Map<String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Server ONLINE");
        respuesta.put("Servidor", "PUERTO 8081, lucas_parte2");
        respuesta.put("Ip", "192.168.1.1");
        
        return respuesta; 
    
    } 
}
