package LabMid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var students = new StudentArrayList();
        students.push(new Student("Nabil", 1, "A", 7));
        students.push(new Student("Zeeshan", 2, "A", 3));
        students.push(new Student("Ehtisham", 3, "A", 2));
        students.push(new Student("Sadat", 4, "A", 1));

        Map<String, ArrayList<Computer>> computersDictionary = new HashMap<>();

        computersDictionary.put("linux", new ArrayList<>());
        computersDictionary.put("windows", new ArrayList<>());
        computersDictionary.get("linux").add(new Computer("pc1", "linux", "intellij"));
        computersDictionary.get("windows").add(new Computer("pc2", "windows", "intellij"));
        computersDictionary.get("linux").add(new Computer("pc3", "linux", "intellij"));
        computersDictionary.get("windows").add(new Computer("pc4", "windows", "intellij"));


        var linuxStrategy = new LinuxStrategy(students, computersDictionary);
        var windowsStrategy = new LinuxStrategy(students, computersDictionary);

        var labAllocatorLinux = new LabAllocator(linuxStrategy);
        var labAllocatorWindows = new LabAllocator(windowsStrategy);
        labAllocatorLinux.allocate();
        labAllocatorWindows.allocate();

        Iterator iterator = students.createIterator();

        Student student = iterator.current();

        System.out.println(student.getAllocatedComputer().getOS() + " " + student.getName());


    }
}
