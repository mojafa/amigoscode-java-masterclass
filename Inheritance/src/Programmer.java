public class Programmer extends Employee{

private String[] programmingLanguage;
    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }
    public void writeCode(){
        System.out.println("I'm writing code");
    }
}
