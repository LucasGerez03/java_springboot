package com.lucasgerez.spring.app1.springboot_applications.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lucasgerez.spring.app1.springboot_applications.models.Empleados;


@Controller
public class EjemploController {
    
    @GetMapping("/detalles_info")
    
    
    public String info(Model model){
        Empleados empleado1 = new Empleados("Lucas", "Gerez", "Calle Falsa 123", "Desarrollador", 2222,111114444, 001);

        model.addAttribute("Titulo", "empleado1_LUCAS");
        model.addAttribute("Empleado", empleado1);


        return "detalles_info";
    
    } 
}
