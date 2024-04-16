package challenge.domain;

import java.util.UUID;

public class Food {
    private UUID id;
    private String label;

    public Food(UUID id, String label) {
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
