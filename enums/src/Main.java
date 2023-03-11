public class Main {
    //enums are data types that can be used to define a variable
    //enums are a special data type that allows a variable to be a set of predefined constants
    //enums are a special "class" that represents a group of constants (unchangeable variables, like final variables)



    public static void main(String[] args) {
        //enums
        Gender male = Gender.MALE;
        System.out.println(Gender.MALE);

        for (Gender gender : Gender.values()){
            System.out.println(gender);
        }

        //from the final variables in GenderConstants.java
        String female = GenderConstants.FEMALE;
        System.out.println(GenderConstants.FEMALE);

    }
}