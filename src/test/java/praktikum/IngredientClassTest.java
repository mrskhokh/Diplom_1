package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientClassTest {
    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Cinnamon", 1.5f);
        assertEquals("Cinnamon", ingredient.getName());
    }

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Tomato", 0.75f);
        assertEquals(0.75f, ingredient.getPrice(), 0.001);
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Apple", 1.0f);
        assertEquals(IngredientType.FILLING, ingredient.getType());
    }

    @Test
    public void testConstructor() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Chicken", 2.0f);
        assertEquals(IngredientType.SAUCE, ingredient.getType());
        assertEquals("Chicken", ingredient.getName());
        assertEquals(2.0f, ingredient.getPrice(), 0.001);
    }
}
