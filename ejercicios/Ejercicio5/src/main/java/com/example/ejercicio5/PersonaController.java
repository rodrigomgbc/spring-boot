package com.example.ejercicio5;

import com.example.ejercicio5.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/personas")
    public String personas(Model model) {
        model.addAttribute("personas", personaService.find(10));
        return "personas";
    }

    @GetMapping("/personas/uno")
    public String una(Model model) {
        model.addAttribute("persona", personaService.findOne());
        return "uno";
    }
}
