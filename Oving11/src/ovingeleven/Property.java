package ovingeleven;

/**
 * Property class.
 * */
public class Property {

  private final int municipalityNumber;
  private final String municipalityName;
  private final int lotNumber;
  private final int sectionNumber;
  private final String propertyName;
  private final double propertyArea;
  private final String ownerName;


  /**
   * Create a new property with property name.
   *
   */
  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
      String propertyName, double propertyArea, String ownerName) {
    if (municipalityNumber <= 5054 && municipalityNumber >= 101) {
      this.municipalityNumber = municipalityNumber;
    } else {
      throw new IllegalArgumentException(("Not a valid municipality number"));
    }
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.propertyName = propertyName;
    this.propertyArea = propertyArea;
    this.ownerName = ownerName;
  }


  /**
   * Create a new property without a property name.
   *
   */
  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
      double propertyArea, String ownerName) {
    if (municipalityNumber > 5054 || municipalityNumber < 101) {
      throw new IllegalArgumentException(("Not a valid municipality number"));
    }
    if (lotNumber <= 0 || sectionNumber <= 0 || propertyArea < 0) {
      throw new IllegalArgumentException(
          "Lot number, section number and property area must be positive");
    }
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.propertyName = "";
    this.propertyArea = propertyArea;
    this.ownerName = ownerName;
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }


  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getPropertyName() {
    return propertyName;
  }

  public double getPropertyArea() {
    return propertyArea;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public String getFormattedId() {
    return getMunicipalityNumber() + "-" + getLotNumber() + "/" + getSectionNumber();
  }

  @Override
  public String toString() {
    if (this.getPropertyName().isEmpty()) {
      return "[" + getFormattedId() + "] Municipality: " + getMunicipalityName() + ", Owner: "
          + getOwnerName() + ", Area: "
          + getPropertyArea();
    } else {
      return "[" + getFormattedId() + "] Municipality: " + getMunicipalityName() + ", Owner: "
          + getOwnerName() + ", Area: "
          + getPropertyArea() + ", Name: " + getPropertyName();
    }
  }


}
