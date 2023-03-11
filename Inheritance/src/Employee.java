import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String address;


    private String experience;

    public void SayHello() {
        System.out.println("Hello,I'm from the parent class");
    }

    //constructors
    public Employee(String name, int age, String address, String experience) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.experience = experience;
    }

    //getter and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    //

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getExperience(), employee.getExperience());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getAddress(), getExperience());
    }

    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
