public class Main {
    public static void main(String[] args) {
        // Strings
        String name = "Haikonnens";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(" ".strip());
        System.out.println(" Hello   ".trim());
        System.out.println(" ".stripLeading());
        System.out.println(name.startsWith("K"));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 3));
        System.out.println(name.replace("n", "m"));
        System.out.println(name.charAt(4));

        //string literals vs strings objects
        String name1 = "Haikonnens";

        //string objects
        String name2 = new String("Haikonnens");

        System.out.println(name == name1);
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        //useful string static methods
        System.out.println(String.join("|", "Hello", "World"));
        System.out.println(String.format("Hello %s", "World"));
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(1.0));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new char[]{'a', 'b', 'c'}));
    }
}