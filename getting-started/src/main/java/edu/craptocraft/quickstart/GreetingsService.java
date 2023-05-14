package edu.craptocraft.quickstart;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingsService {

    @ConfigProperty(name = "greetings.message")
    String msg;

    public String toUpperCase() {
        return msg.toUpperCase();
    }
}
