package com.lucasgerez.spring.app1.springboot_applications.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.lucasgerez.spring.app1.springboot_applications.models.Empleados;


@Controller
public class EjemploController {
    
    @GetMapping("/detalles_info")
    
    
    public String info(Model model){
        Empleados empleado1 = new Empleados("Lucas", "Gerez", "null_xd", "Desarrollador", 2222,111114444, 001);

        model.addAttribute("Titulo", "empleado1_LUCAS");
        model.addAttribute("Empleado", empleado1);


        return "detalles_info";
    
    } 
    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList(
            new Empleados("Lucas", "Gerez", "Calle Falsa 123", "Desarrollador", 22,123456789, 001),
            new Empleados("Cosme", "Fulanito", "Avenida Siempre Viva 456", "Diseñador", 28,987654321, 002),
            new Empleados("Martina", "Gennari", "Boulevard Central 789", "Gerente", 35,456789123, 003),
            new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
            new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05)
        );
    }
}
