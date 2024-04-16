package challenge.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.component.view.TerminalUIBuilder;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Historic {

    @Autowired
    TerminalUIBuilder builder;
    @ShellMethod("Historic of an aliment")
    public int historic() {
        return 0;
    }
}
