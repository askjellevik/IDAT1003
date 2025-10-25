package ovingeleven;

import java.util.ArrayList;

public class PropertyRegister {

  private final ArrayList<Property> properties;

  public PropertyRegister() {
    this.properties = new ArrayList<>();
  }


  public void registerNewNoNameProperty(int municipalityNumber, String municipalityName,
      int lotNumber,
      int sectionNumber,
      double propertyArea, String ownerName) {
    Property property = new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber,
        propertyArea, ownerName);
    properties.add(property);
  }

  public void registerNewProperty(int municipalityNumber, String municipalityName, int lotNumber,
      int sectionNumber, String propertyName,
      double propertyArea, String ownerName) {
    Property property = new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber,
        propertyName, propertyArea, ownerName);
    properties.add(property);
  }

  public void deleteProperty(Property propertyToDelete) {
    properties.removeIf(property -> property.equals(propertyToDelete));
  }

  public ArrayList<Property> getProperties() {
    return properties;
  }
}
