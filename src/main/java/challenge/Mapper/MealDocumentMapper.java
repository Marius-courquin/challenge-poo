package challenge.Mapper;

import challenge.document.model.FoodModel;
import challenge.document.MealDocument;
import challenge.document.model.DrinkModel;
import challenge.domain.Meal;

import java.util.stream.Collectors;

public class MealDocumentMapper implements Mapper<Meal, MealDocument> {
    public MealDocument fromDomain(Meal meal) {
        return new MealDocument(
                meal.getId(),
                meal.getDate(),
                meal.getTime(),
                meal.getType(),
                meal.getFoods().stream().map(FoodModel::fromModel).collect(Collectors.toList()),
                meal.getDrinks().stream().map(DrinkModel::fromModel).collect(Collectors.toList())
        );
    }

    public Meal toDomain(MealDocument obj) {
        return new Meal(
                obj.getId(),
                obj.getDate(),
                obj.getTime(),
                obj.getType(),
                obj.getFoods().stream().map(FoodModel::toModel).collect(Collectors.toList()),
                obj.getDrinks().stream().map(DrinkModel::toModel).collect(Collectors.toList())
        );
    }
}
