package com.example.ejercicio2;

import jakarta.annotation.Priority;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("procesoA")
@Priority(3)
public class ProcesoA implements CommandLineRunner {
    private MessageService messageService;

    public ProcesoA(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getName());
    }
}
