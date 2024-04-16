package domain;

import domain.MealType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public class Meal {
    private UUID id;
    private LocalDate date;
    private LocalTime time;

    private MealType type;

    private List<Food> foods;

    private List<Drink> drinks;

    public Meal(UUID id, LocalDate date, LocalTime time, MealType type, List<Food> foods, List<Drink> drinks) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.type = type;
        this.foods = foods;
        this.drinks = drinks;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public MealType getType() {
        return type;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }
}
