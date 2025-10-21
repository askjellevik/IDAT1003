package taskone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class name.
 * */
public class TaskOne {


  /**
   * UI class.
   * */
  public static void main(String[] args) {

    EventRegistry eventRegistry = new EventRegistry();

    eventRegistry.registerNewEvent("Flo Rida", "Trondheim", "UKA", "Concert", 202517101800L);
    eventRegistry.registerNewEvent("Kygo", "Oslo", "SR-Bank", "Concert", 202517101700L);
    eventRegistry.registerNewEvent("Sjaman Durek", "Oslo", "Royal family", "Lecture",
        202410101700L);

    boolean runProgram = true;
    int menuChoice = 0;

    Scanner scanner = new Scanner(System.in);

    while (runProgram) {

      displayMainMenu();
      menuChoice = readInt(scanner);
      scanner.nextLine();

      if (menuChoice == 1) {
        System.out.println("Enter the event name: ");
        String inpName = scanner.nextLine();
        System.out.println("Enter the event location: ");
        String inpLocation = scanner.nextLine();
        System.out.println("Enter the event host: ");
        String inpHost = scanner.nextLine();
        System.out.println("Enter the event type: ");
        String inpType = scanner.nextLine();
        System.out.println("Enter the event date (YYYYMMDDHhmm): ");
        long inpDate = readDateAsLong(scanner);
        scanner.nextLine();

        eventRegistry.registerNewEvent(inpName, inpLocation, inpHost, inpType, inpDate);
      } else if (menuChoice == 2) {
        System.out.println("Enter a location: ");
        String inpLocation = scanner.nextLine();
        ArrayList<Event> eventArrayList = eventRegistry.getEventsByLocation(inpLocation);
        if (eventArrayList.isEmpty()) {
          System.out.println("No events found.");
        } else {
          for (Event event : eventArrayList) {
            System.out.println(event);
          }
        }
      } else if (menuChoice == 3) {
        System.out.println("Enter a date (YYYYMMDDHhmm):  ");
        String inpDate = String.valueOf(readDateAsLong(scanner));
        ArrayList<Event> eventArrayList = eventRegistry.getEventsByDate(inpDate);
        if (eventArrayList.isEmpty()) {
          System.out.println("No events found.");
        } else {
          for (Event event : eventArrayList) {
            System.out.println(event);
          }
        }
      } else if (menuChoice == 4) {
        System.out.println("Enter the first date: ");
        long inpFirstDate = readDateAsLong(scanner);
        long inpLastDate = readDateAsLong(scanner);
        ArrayList<Event> eventArrayList = eventRegistry.getEventsWithinDates(inpFirstDate,
            inpLastDate);
        if (eventArrayList.isEmpty()) {
          System.out.println("No events found.");
        } else {
          for (Event event : eventArrayList) {
            System.out.println(event);
          }
        }


      } else if (menuChoice == 5) {
        System.out.println("Enter your sorting option: ");
        System.out.println("1: Location");
        System.out.println("2: Type");
        System.out.println("3: Date");
        int userChoice = readInt(scanner);
        ArrayList<Event> sortedEvents = eventRegistry.getSortedEvents(userChoice);
        if (sortedEvents.isEmpty()) {
          System.out.println("No events found.");
        } else {
          for (Event event : sortedEvents) {
            System.out.println(event);
          }
        }

      } else if (menuChoice == 6) {
        runProgram = false;
      }

    }
    scanner.close();


  }

  /**
   * Method to display main menu in terminal.
   * */
  public static void displayMainMenu() {
    System.out.println("------");
    System.out.println("1: Register new event");
    System.out.println("2: Display events based on location");
    System.out.println("3: Display events based on date");
    System.out.println("4: Display events within two dates");
    System.out.println("5: Display events sorted by date, location or type");
    System.out.println("6: Terminate program");
  }


  /**
   * Method to read only integers from user.
   * */
  public static int readInt(Scanner scanner) {
    System.out.println("Enter the number of your choice: ");
    while (true) {
      if (scanner.hasNextInt()) {
        return scanner.nextInt();
      } else {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.next();
      }
    }
  }

  /**
   * Method to read only 12 integers from user.
   * */
  public static long readDateAsLong(Scanner scanner) {
    System.out.println("Enter the number of your choice: ");
    while (true) {
      if (scanner.hasNextLong()) {
        return scanner.nextLong();
      } else {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.next();
      }
    }
  }




}
