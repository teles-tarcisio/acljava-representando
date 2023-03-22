import java.util.ArrayList;

public class Institution {
  private String fullName;
  private String abbreviation;
  private Location location = new Location();
  private ArrayList<Course> courses = new ArrayList<>();

  public Location getLocation() {
    return this.location;
  }
  
  public void setLocation(String country, String state, String city) {
    this.location.setCountry(country);
    this.location.setState(state);
    this.location.setCity(city);
  }

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  



}
