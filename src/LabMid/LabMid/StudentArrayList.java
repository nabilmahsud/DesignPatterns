package LabMid;

public class StudentArrayList {
    private Student [] students = new Student[10];
    private int index;

    public void push(Student student) {
        students[index] = student;
        index++;
    }

    public String pop() {
        index -= 1;
        var lastStudent = students[index];
        return lastStudent.getName();
    }

    public ArrayIterator createIterator() {
        return new ArrayIterator(this);
    }

    private class ArrayIterator implements Iterator {
        private StudentArrayList students;
        private int index = 0;

        private ArrayIterator(StudentArrayList students) {
            this.students = students;
        }

        @Override
        public Boolean hasNext() {
            return (index < students.index);
        }

        @Override
        public Student current() {
            return students.students[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}

