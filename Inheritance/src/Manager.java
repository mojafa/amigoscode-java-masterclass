public class Manager extends Employee{
    private int[] team;
    public Manager(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }
    public void Report(){
        System.out.println("I'm writing reports");
    }
}

