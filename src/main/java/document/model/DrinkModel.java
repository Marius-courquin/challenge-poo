package document.model;

import domain.Drink;

import java.util.UUID;

public class DrinkModel{
    private UUID id;
    private String label;

    public DrinkModel(UUID id, String label) {
        this.id = id;
        this.label = label;
    }

    public UUID getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static DrinkModel fromModel(Drink drink) {
        return new DrinkModel(drink.getId(), drink.getLabel());
    }

    public static Drink toModel(DrinkModel drinkModel) {
        return new Drink(drinkModel.getId(), drinkModel.getLabel());
    }
}
