package com.example.ejercicio3;

import jakarta.annotation.Priority;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("procesoB")
@Priority(2)
public class ProcesoB implements CommandLineRunner {
    private MessageService messageService;

    public ProcesoB(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getName());
    }
}
