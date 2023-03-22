public class Student {
  private String name;
  private String cpf;
  private String email;
  private int age;
  private Location location = new Location();

  public Student(String cpf) {
    this.cpf = cpf;
  }

  public Student(String name, String cpf) {
    this.setName(name);
    this.cpf = cpf;
  }

  public String getCPF() {
    return this.cpf;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setLocation(String country, String state, String city) {
    this.location.setCountry(country);
    this.location.setState(state);
    this.location.setCity(city);
  }
  
}
