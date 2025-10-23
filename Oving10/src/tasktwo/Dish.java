package tasktwo;


/**
 * Dish class.
 * */
public class Dish {

  private final String name;
  private final String type;
  private final double price;
  private final String recipe;


  /**
   * Create a new dish.
   *
   * @param name   the name of the dish
   * @param type   the type of the dish
   * @param price  the price of the dish
   * @param recipe the recipe of the dish
   */
  public Dish(String name, String type, double price, String recipe) {
    this.name = name;
    this.type = type;
    this.price = price;
    this.recipe = recipe;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }

  public String getRecipe() {
    return recipe;
  }

  @Override
  public String toString() {
    return "Dish name: " + getName() + " | Type: " + getType() + " | Price: " + getPrice()
        + " | Recipe: " + getRecipe();
  }
}
