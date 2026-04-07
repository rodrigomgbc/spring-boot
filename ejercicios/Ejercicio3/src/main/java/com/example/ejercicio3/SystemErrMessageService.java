package com.example.ejercicio3;

import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SystemErrMessageService implements MessageService{
    @Override
    public void showMessage(String message) {
        System.err.println(message);
    }
}
