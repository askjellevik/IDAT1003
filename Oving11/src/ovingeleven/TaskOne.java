package ovingeleven;

public class TaskOne {

  public static void main(String[] args) {

    PropertyRegister propertyRegister = new PropertyRegister();

    addTestData(propertyRegister);

    MenuUserInterface menuUserInterface = new MenuUserInterface(propertyRegister);

    menuUserInterface.startProgram();

  }

  private static void addTestData(PropertyRegister propertyRegister) {
    propertyRegister.registerNewNoNameProperty(1445, "Gloppen", 77, 631, 1017.6, "Jens Olsen");
    propertyRegister.registerNewProperty(1445, "Gloppen", 77, 131, "Syningom", 661.3,
        "Nicolay Madsen");
    propertyRegister.registerNewProperty(1445, "Gloppen", 75, 19, "Fugletun", 650.6,
        "Evilyn Jensen");
    propertyRegister.registerNewNoNameProperty(1445, "Gloppen", 75, 188, 1457.2, "Karl Ove Bråten");
    propertyRegister.registerNewProperty(1445, "Gloppen", 69, 47, "Høiberg", 1339.4,
        "Elsa Indregård");
  }

}
