public class Main {
    public static void main(String[] args) {
        /*
        byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        char -> Character
        boolean -> Boolean
         */
        // int age = 20;
        Integer age = 20;
        // wrapper class allows us to use methods on primitive types (int, double, etc.)
        //age.toString()
        var age2 = "20";
        int a = Integer.parseInt(age2);
        System.out.println(a);
    }
}