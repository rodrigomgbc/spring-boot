package com.example.ejercicio6;

import com.example.ejercicio6.service.PrediccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  PrediccionController {
    @Autowired
    PrediccionService prediccionService;

    @GetMapping("/prediccion")
    public String prediccion(Model model){
        model.addAttribute("dias", prediccionService.devolverPrediccionDia());
        return "prediccion";
    }
}
