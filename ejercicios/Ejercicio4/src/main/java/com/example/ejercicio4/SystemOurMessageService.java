package com.example.ejercicio4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SystemOurMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
