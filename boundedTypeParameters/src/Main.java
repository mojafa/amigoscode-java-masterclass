public class Main {
    public static void main(String[] args) {

        // if we change the int to double, it will not work
        // because the method is only for int
        // for it to work we can use generics for Integer because both int and double arew numbers and can be used

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       // countGreaterThan(numbers, 3);
        System.out.println(
                countGreaterThan(numbers, 3)
        );

        Double[] numbers2 = {1.1, 2.1, 3.2, 4.6, 5.67, 6.7, 7.6, 8.0, 9.0, 10.0};
        System.out.println(
                countGreaterThan(numbers2, 3.2)
        );
    }
    //before generics
//    static int countGreaterThan(int[] numbers, int number)
    //after generics
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number)
    {
        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > number) {
//                count++;
//            }
//        }
        //OR
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}