package challenge.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Meal {

    @ShellMethod("Add a meal")
    public int meal() {
        System.out.println("Meal");
        return 0;
    }
}
