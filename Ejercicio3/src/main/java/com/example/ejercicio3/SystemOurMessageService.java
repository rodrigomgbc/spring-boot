package com.example.ejercicio3;

import org.springframework.stereotype.Component;

@Component
public class SystemOurMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
