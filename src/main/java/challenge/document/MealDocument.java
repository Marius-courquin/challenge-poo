package challenge.document;

import challenge.document.model.FoodModel;
import challenge.domain.MealType;
import challenge.document.model.DrinkModel;
import challenge.domain.Meal;
import org.mongojack.Id;
import org.mongojack.ObjectId;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MealDocument {
    @ObjectId
    @Id
    private UUID id;
    private LocalDate date;
    private LocalTime time;

    private MealType type;

    private List<FoodModel> foods;

    private List<DrinkModel> drinks;

    public MealDocument(UUID id, LocalDate date, LocalTime time, MealType type, List<FoodModel> foods, List<DrinkModel> drinks) {
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

    public List<FoodModel> getFoods() {
        return foods;
    }

    public List<DrinkModel> getDrinks() {
        return drinks;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setType(MealType type) {
        this.type = type;
    }

    public void setFoods(List<FoodModel> foods) {
        this.foods = foods;
    }

    public void setDrinks(List<DrinkModel> drinks) {
        this.drinks = drinks;
    }

    public static MealDocument fromDomain(Meal meal) {
        return new MealDocument(
                meal.getId(),
                meal.getDate(),
                meal.getTime(),
                meal.getType(),
                meal.getFoods().stream().map(FoodModel::fromModel).collect(Collectors.toList()),
                meal.getDrinks().stream().map(DrinkModel::fromModel).collect(Collectors.toList())
        );
    }
}
