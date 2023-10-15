package lab6.iterator.tutorialpointexample;

public class IteratorPatternDemo {

    public static void printStudentsWithNameStartingFromAny() {
        var namesRepository = new NameRepository();

        namesRepository.push("Robert");
        namesRepository.push("John");
        namesRepository.push("Julie");

        Iterator iterator = namesRepository.getIterator();
        
        while(iterator.hasNext()) {
            var name = iterator.current();
            System.out.println(name);
            iterator.next();
        }

        while(iterator.hasPrevious()) {
            var name = iterator.current();
            System.out.println(name);
            iterator.previous();
        }

    }

    public static void main(String[] args) {

        printStudentsWithNameStartingFromAny();


    }
}