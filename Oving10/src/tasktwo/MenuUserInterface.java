package tasktwo;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUserInterface {

  private final MenuRegister menuRegister;
  private final Scanner scanner;
  private boolean running;

  public MenuUserInterface(MenuRegister menuRegister) {
    this.menuRegister = menuRegister;
    this.scanner = new Scanner(System.in);
    this.running = true;
  }

  public void startProgram() {
    while (running) {
      System.out.println("-------");
      System.out.println("1: Register a new dish");
      System.out.println("2: Search up a dish by name");
      System.out.println("3: Find all dishes of a specific type");
      System.out.println("4: Register a new menu with a set of dishes");
      System.out.println("5: Find menus with total price within an interval");
      System.out.println("6: Display all dishes");
      System.out.println("7: Display all menus");
      System.out.println("8: Exit menu registry");

      int userChoice = getUserChoice();

      switch (userChoice) {
        case 1:
          registerDish();
          break;
        case 2:
          findDishByName();
          break;
        case 3:
          findDishesByType();
          break;
        case 4:
          registerMenuWithDishes();
          break;
        case 5:
          findMenusWithinPriceInterval();
          break;
        case 6:
          findAllDishes();
          break;
        case 7:
          findAllMenus();
          break;
        case 8:
          endProgram();
          break;
        default:
          System.out.println("That was not an available option. Try again");
          break;

      }

    }
  }

  private void registerDish() {
    System.out.println("Enter the name of the new dish:");
    String inpName = getUserString();

    System.out.println("Enter the type of the new dish:");
    String inpType = getUserString();

    System.out.println("Enter the price of the new dish:");
    double inpPrice = getUserDouble();

    System.out.println("Enter the recipe of the new dish:");
    String inpRecipe = getUserString();

    menuRegister.registerNewDish(inpName, inpType, inpPrice, inpRecipe);
    System.out.println("The new dish has been registered.");
  }

  private void findDishByName() {
    System.out.println("Enter the name of the dish you are searching for: ");
    String inpNameOfDish = getUserString();

    System.out.println(menuRegister.findDishByName(inpNameOfDish));
  }

  private void findDishesByType() {
    System.out.println("Enter the type of the dishes you are searching for: ");
    String inpTypeOfDish = getUserString();
    for (Dish dish : menuRegister.findDishesByType(inpTypeOfDish)) {
      System.out.println(dish);
    }
  }

  private void registerMenuWithDishes() {
    System.out.println("Enter the name of the menu you are registering: ");
    String inpMenuName = getUserString();
    ArrayList<Dish> dishesToAdd = chooseSetOfDishes();

    menuRegister.registerNewMenu(inpMenuName, dishesToAdd);
  }

  private ArrayList<Dish> chooseSetOfDishes() {
    ArrayList<Dish> dishesToAdd = new ArrayList<>();
    boolean haveSelectedDishes = false;
    while (!haveSelectedDishes) {
      int i = 1;
      for (Dish dish : menuRegister.getDishes()) {
        System.out.println(i + ": " + dish);
        i++;
      }

      System.out.println(i + ": Exit the dish selecting menu");

      int chosenDishIndex = getUserChoice();
      if (chosenDishIndex > 0 && chosenDishIndex < i) {
        dishesToAdd.add(menuRegister.getDishes().get(chosenDishIndex - 1));
      } else if (chosenDishIndex == i) {
        haveSelectedDishes = true;
      } else {
        System.out.println("Enter a valid dish");
      }

    }
    return dishesToAdd;
  }

  private void findMenusWithinPriceInterval() {
    System.out.println("Enter the lowest possible price of the menu: ");
    double lowestPrice = getUserDouble();
    System.out.println("Enter the highest possible price of the menu: ");
    double highestPrice = getUserDouble();
    ArrayList<Menu> menus = menuRegister.getMenusByTotalPrice(lowestPrice, highestPrice);

    for (Menu menu : menus) {
      System.out.println("<<<-- " + menu.getName() + " MENU -->>>");
      System.out.println(menu.getName());
      for (Dish dish : menu.getDishes()) {
        System.out.println(dish.getName() + ". Price: " + dish.getPrice());
      }
    }

  }

  private void findAllDishes() {
    for (Dish dish : menuRegister.getDishes()) {
      System.out.println(dish);
    }
  }

  private void findAllMenus() {
    for (Menu menu : menuRegister.getMenus()) {
      System.out.println("<<<-- " + menu.getName() + " MENU -->>>");
      System.out.println(menu.getName());
      for (Dish dish : menu.getDishes()) {
        System.out.println(dish.getName() + ". Price: " + dish.getPrice());
      }
    }
  }

  private void endProgram() {
    running = false;
    scanner.close();
    System.out.println("Ended the menu register. Goodbye.");
  }


  private int getUserChoice() {
    while (true) {
      if (scanner.hasNextInt()) {
        int inp = scanner.nextInt();
        scanner.nextLine();
        return inp;
      } else {
        System.out.println("Enter a valid integer");
        scanner.next();
      }
    }
  }

  private String getUserString() {
    return scanner.nextLine();
  }

  private double getUserDouble() {
    while (true) {
      if (scanner.hasNextDouble()) {
        double inp = scanner.nextDouble();
        scanner.nextLine();
        return inp;
      } else {
        System.out.println("Enter a valid number");
        scanner.next();
      }
    }
  }

}
