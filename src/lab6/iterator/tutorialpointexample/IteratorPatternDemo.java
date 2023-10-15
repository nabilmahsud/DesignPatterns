package lab6.iterator.tutorialpointexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IteratorPatternDemo {

    public static void printStudentsWithNameStartingFromAny(String namePattern) {
        Pattern pattern = Pattern.compile(namePattern, Pattern.CASE_INSENSITIVE);
        var namesRepository = new NameRepository();

        namesRepository.push(new Student("1", "Robert", 1, "123"));
        namesRepository.push(new Student("2", "Muhammad Adil", 1, "123"));
        namesRepository.push(new Student("3", "Julie", 1, "123"));


        Iterator iterator = namesRepository.getIterator();
        
        while(iterator.hasNext()) {
            var student = iterator.current();
            iterator.next();
        }

        while(iterator.hasPrevious()) {
            var student = iterator.current();
            Matcher matcher = pattern.matcher(student.getName());
            if (matcher.find())
                System.out.println(student.getDetails());
            iterator.previous();
        }
    }

    public static void printAllStudents() {
        var namesRepository = new NameRepository();
        namesRepository.push(new Student("1", "Robert", 1, "123"));
        namesRepository.push(new Student("2", "Muhammad Adil", 1, "123"));
        namesRepository.push(new Student("3", "Julie", 1, "123"));
        Iterator iterator = namesRepository.getIterator();

        while(iterator.hasNext()) {
            var student = iterator.current();
            System.out.println(student.getDetails());
            iterator.next();
        }
    }

    public static void main(String[] args) {

        printStudentsWithNameStartingFromAny("Muhammad");
       // printAllStudents();

    }
}