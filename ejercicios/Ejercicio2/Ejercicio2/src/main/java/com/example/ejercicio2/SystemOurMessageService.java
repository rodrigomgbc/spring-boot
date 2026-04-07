package com.example.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class SystemOurMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
