package com.example.ejercicio4;

import com.github.javafaker.Faker;
import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("procesoB")
@Priority(2)
public class ProcesoB implements CommandLineRunner {
    private MessageService messageService;
    private Faker faker;

    public ProcesoB(@Qualifier("systemOurMessageService") MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getName());
        messageService.showMessage(faker.chuckNorris().fact());
    }
}
