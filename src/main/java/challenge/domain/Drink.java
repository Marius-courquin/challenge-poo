package challenge.domain;

import java.util.UUID;

public class Drink {
    private UUID id;
    private String label;

    public Drink(UUID id, String label) {
        this.id = id;
        this.label = label;
    }

    public UUID getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
