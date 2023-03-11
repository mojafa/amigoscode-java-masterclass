public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John", 25, "USA", "3 years");
Manager manager = new Manager("Mike", 30, "USA", "5 years");
        System.out.println(programmer);
        System.out.println(manager);
        programmer.writeCode();
        manager.Report();
    }
}