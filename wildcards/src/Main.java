import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> list1 = Arrays.asList("11",2,new Date());
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        List<String> list3 = Arrays.asList("a","b","c","d","e");
        print(list1);
        print(list2);
        print(list3);
        //upper bounded wildcard
        // here we can work with number Integer
        print2(list2);
        //print2(list1); //error
        //lower bounded wildcard
        // here we can work with number Integer
        print3(list2);
    }

    //unbounded wildcard ?
    static void print (List<?> list){
        //list.forEach(System.out::println);
        list.forEach(e -> {
                    System.out.println(e.getClass().getName());
                    System.out.println(e);

                });
    }

    //upper bounded wildcard
    static void print2 (List<? extends Number> list){
        list.forEach(System.out::println);
    }


    //lower bounded wildcard
    static void print3 (List<? super Number> list){
        list.forEach(System.out::println);
    }
}