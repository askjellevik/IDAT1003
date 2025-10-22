package tasktwo;


import java.util.ArrayList;

/**
 * Class to register dishes and menus.
 * */
public class MenuRegister {

  private ArrayList<Dish> dishes;
  private ArrayList<Menu> menus;

  /**
   * Constructor for menu registry.
   * */
  public MenuRegister() {
    this.dishes = new ArrayList<>();
    this.menus = new ArrayList<>();
  }


  public void registerNewDish(String name, String type, double price, String recipe) {
    Dish dish = new Dish(name, type, price, recipe);
    dishes.add(dish);
  }

  public Dish findDishByName(String name) {
    for (Dish dish : dishes) {
      if (dish.getName().equalsIgnoreCase(name)) {
        return dish;
      }
    }
    return null;
  }

  public ArrayList<Dish> findDishesByType(String type) {
    ArrayList<Dish> foundDishes = new ArrayList<>();
    for (Dish dish : dishes) {
      if (dish.getType().equalsIgnoreCase(type)) {
        foundDishes.add(dish);
      }
    }
    return foundDishes;
  }

  public void registerNewMenu(String name, ArrayList<Dish> dishes) {
    Menu newMenu = new Menu(name, dishes);
    menus.add(newMenu);
  }

  public ArrayList<Menu> getMenusByTotalPrice(double minPrice, double maxPrice) {
    ArrayList<Menu> foundMenus = new ArrayList<>();
    for (Menu menu : menus) {
      if (menu.getTotalMenuPrice() > minPrice && menu.getTotalMenuPrice() < maxPrice) {
        foundMenus.add(menu);
      }
    }
    return foundMenus;
  }

  public ArrayList<Dish> getDishes() {
    return dishes;
  }

  public ArrayList<Menu> getMenus() {
    return menus;
  }
}
