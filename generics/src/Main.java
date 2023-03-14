public class Main {
    public static void main(String[] args) {

        String[] names = {"John", "Jane", "Joe", "Jill", "Jack"};
        // we cannot use int, double or char with generics, it has to be the object versions of it
        // Integer, Double, Character
        Character[] letters = {'J', 'a', 'v', 'a'};
        Integer[] numbers = {1, 2, 3, 4, 5};


        // we can generics for ant data type
        print (names);
        print (letters);
        }

        //T means any data type
    // aarray is the name

        static <T>  void print (T[] array){
        for ( T e : array){
            System.out.println(
                    e.getClass().getName()+ " - " + e);
        }
        }
}