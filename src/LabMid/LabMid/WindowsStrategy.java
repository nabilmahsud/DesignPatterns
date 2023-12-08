package LabMid;

import java.util.ArrayList;
import java.util.Map;

public class WindowsStrategy implements OSStrategy {
    private StudentArrayList students;
    private ArrayList linuxComputers;

    private ArrayList<Student> linuxList = new ArrayList<>();

    WindowsStrategy(StudentArrayList students, Map<String, ArrayList<Computer>> computersDictionary) {
        this.students = students;
        this.linuxComputers = computersDictionary.get("windows");
    }

    @Override
    public ArrayList allocate() {
        int i = 0;
        Iterator iterator = students.createIterator();
        while(iterator.hasNext()) {
            if (i == linuxComputers.size())
                break;
            var student = iterator.current();
            if (student.getReg() % 2 == 0) {
                student.setAllocatedComputer((Computer) linuxComputers.get(i));
                linuxList.add(student);
                i++;
            }
            iterator.next();
        }
        return linuxList;
    }

}
