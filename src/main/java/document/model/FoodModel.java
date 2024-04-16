package document.model;

import domain.Food;

import java.util.UUID;

public class FoodModel {
    private UUID id;
    private String label;

    public FoodModel(UUID id, String label) {
        this.id = id;
        this.label = label;
    }

    public UUID getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static FoodModel fromModel(domain.Food food) {
        return new FoodModel(food.getId(), food.getLabel());
    }

    public static Food toModel(FoodModel foodModel) {
        return new domain.Food(foodModel.getId(), foodModel.getLabel());
    }
}
