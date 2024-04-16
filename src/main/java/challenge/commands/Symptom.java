package challenge.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Symptom {
    @ShellMethod("Add a symptom")
    public int symptom() {
        System.out.println("Symptom");
        return 0;
    }
}
