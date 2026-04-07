package com.example.ejercicio3;

import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("procesoC")
@Priority(1)
public class ProcesoC implements CommandLineRunner {
    private MessageService messageService;

    public ProcesoC(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getName());
    }
}
