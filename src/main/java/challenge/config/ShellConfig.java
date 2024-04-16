package challenge.config;

import challenge.commands.Historic;
import challenge.commands.Meal;
import challenge.commands.Symptom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellMethodAvailability;

@Configuration
public class ShellConfig {
    @Bean
    public Meal meal() {
        return new Meal();
    }

    @Bean
    public Symptom symptom() {
        return new Symptom();
    }

    @Bean
    public Historic historic() {
        return new Historic();
    }

}
