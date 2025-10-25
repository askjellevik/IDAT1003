package ovingeleven;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUserInterface {

  private final PropertyRegister propertyRegister;
  private final Scanner scanner;
  private boolean running;

  public MenuUserInterface(PropertyRegister propertyRegister) {
    this.propertyRegister = propertyRegister;
    this.scanner = new Scanner(System.in);
    this.running = true;
  }

  public void startProgram() {
    while (running) {
      System.out.println("-------");
      System.out.println("1: Register a new property");
      System.out.println("2: Display all registered properties");
      System.out.println("3: Search up a specific property");
      System.out.println("4: Calculate average property area of all properties");
      System.out.println("5: Exit property registry");

      int userChoice = getUserInt();

      switch (userChoice) {
        case 1:
          registerNewProperty();
          break;
        case 2:
          displayAllProperties();
          break;
        case 3:
          displaySpecificProperty();
          break;
        case 4:
          calculateAndDisplayAverageArea();
          break;
        case 5:
          endProgram();
          break;
        default:
          System.out.println("That was not an available option. Try again");
          break;

      }

    }
  }

  private void registerNewProperty() {
    System.out.println("Enter the municipality number:");
    final int inpMunicipalityNumber = getUserInt();

    System.out.println("Enter the municipality name:");
    final String inpMunicipalityName = getUserString();

    System.out.println("Enter the lot number:");
    final int inpLotNumber = getUserInt();

    System.out.println("Enter the section number:");
    final int inpSectionNumber = getUserInt();

    System.out.println("Enter the property area:");
    final double inpPropertyArea = getUserDouble();

    System.out.println("Enter the property owner:");
    final String inpPropertyOwner = getUserString();

    System.out.println("Do you want to give a name to the property?");
    System.out.println("1: Yes");
    System.out.println("2: No");
    while (true) {
      int inpWantName = getUserInt();
      if (inpWantName == 1) {
        System.out.println("Enter the property name: ");
        String inpPropertyName = getUserString();
        propertyRegister.registerNewProperty(inpMunicipalityNumber, inpMunicipalityName,
            inpLotNumber, inpSectionNumber, inpPropertyName, inpPropertyArea, inpPropertyOwner);
        break;
      } else if (inpWantName == 2) {
        propertyRegister.registerNewNoNameProperty(inpMunicipalityNumber, inpMunicipalityName,
            inpLotNumber, inpSectionNumber, inpPropertyArea, inpPropertyOwner);
        break;
      } else {
        System.out.println("Enter a valid option");
      }
    }

    System.out.println("The new property has been registered.");
  }

  private void displayAllProperties() {
    ArrayList<Property> properties = propertyRegister.getProperties();
    if (!properties.isEmpty()) {
      for (Property property : properties) {
        System.out.println(property);
      }
    } else {
      System.out.println("No properties registered");
    }
  }

  private void displaySpecificProperty() {
    System.out.println("Enter the property municipality number");
    int municipalityNumber = getUserInt();

    System.out.println("Enter the property lot number");
    int lotNumber = getUserInt();

    System.out.println("Enter the property section number");
    int sectionNumber = getUserInt();
    boolean foundProperty = false;

    ArrayList<Property> properties = propertyRegister.getProperties();
    for (Property property : properties) {
      if (property.getMunicipalityNumber() == municipalityNumber
          && property.getLotNumber() == lotNumber && property.getSectionNumber() == sectionNumber) {
        System.out.println("Displaying the property with code " + property);
        System.out.println(property);
        foundProperty = true;
      }
    }
    if (!foundProperty) {
      System.out.println("Did not find a matching property");

    }


  }

  private void calculateAndDisplayAverageArea() {
    ArrayList<Property> properties = propertyRegister.getProperties();
    if (properties.isEmpty()) {
      System.out.println("No properties registered");
      return;
    }
    double totalArea = 0;
    for (Property property : properties) {
      totalArea += property.getPropertyArea();
    }
    double averageArea = totalArea / properties.size();

    System.out.println(
        "The average area of all properties registered is: " + averageArea);
  }


  private void endProgram() {
    running = false;
    scanner.close();
    System.out.println("Ended the menu register. Goodbye.");
  }


  private int getUserInt() {
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
