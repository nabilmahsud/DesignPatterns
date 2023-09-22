package advancejava.generics;

public class Main {
    public static void main(String[] args) {
        GenericList<User> listOfUsers = new GenericList<>();
        GenericList<Integer> listOfIntegers = new GenericList<>();

        listOfUsers.add(new User());
        listOfIntegers.add(1);

    }
}
