package tasktwo;

import java.util.ArrayList;

public class TaskTwo {

  public static void main(String[] args) {

    MenuRegister menuRegister = new MenuRegister();

    // Hardcoded test-dishes.
    menuRegister.registerNewDish("Pizza", "Dinner", 189, "Mix flour, tomatoes and cheese.");
    menuRegister.registerNewDish("Lasagne", "Dinner", 210,
        "Mix pasta plates, tomatoes and cheese.");
    menuRegister.registerNewDish("Club Sandwich", "Lunch", 149.90,
        "Chicken & lettuce under bacon.");

    // Hardcoded lunch menu to test.
    ArrayList<Dish> lunchDishes = new ArrayList<>();
    lunchDishes.add(menuRegister.findDishByName("Club Sandwich"));
    menuRegister.registerNewMenu("Lunch", lunchDishes);

    // Hardcoded dinner menu to test.
    ArrayList<Dish> dinnerDishes = new ArrayList<>();
    dinnerDishes.add(menuRegister.findDishByName("Pizza"));
    dinnerDishes.add(menuRegister.findDishByName("Lasagne"));
    menuRegister.registerNewMenu("Dinner", dinnerDishes);

    MenuUserInterface menuUserInterface = new MenuUserInterface(menuRegister);

    menuUserInterface.startProgram();


  }

}
