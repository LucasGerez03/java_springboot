package com.lucasgerez.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.lucasgerez.spring.app1.springboot_applications.models.Empleados;
import com.lucasgerez.spring.app1.springboot_applications.models.dto.ClaseDTO;



@RestController
@RequestMapping("/api")

public class EjemploRestController {
    
    @GetMapping(path = "/detalles_info2")
    // @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    
            //Map<String, Object>
    public ClaseDTO detalles_info(){
        
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Lucas Gerez");

        
        /*Empleados empleado1 = new Empleados("Lucas", "Gerez", "Calle Falsa 123", "Desarrollador", 22,123456789, 001);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos del Empleado:");
        respuesta.put("Informacion", empleado1);
        */
        
        return usuario1; 
    
    } 
}
