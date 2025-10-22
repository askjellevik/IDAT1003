package tasktwo;

import java.util.ArrayList;

public class Menu {

  private final String name;
  private final ArrayList<Dish> dishes;

  public Menu(String name, ArrayList<Dish> dishes) {
    this.name = name;
    this.dishes = new ArrayList<>(dishes);
  }


  public double getTotalMenuPrice() {
    double totalPrice = 0;
    for (Dish dish : dishes) {
      totalPrice = totalPrice + dish.getPrice();
    }
    return totalPrice;
  }

  public void addDishToMenu(Dish dish) {
    dishes.add(dish);
  }

  public ArrayList<Dish> getDishes() {
    return dishes;
  }

  public String getName() {
    return name;
  }
}
