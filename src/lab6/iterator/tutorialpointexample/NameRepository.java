package lab6.iterator.tutorialpointexample;

public class NameRepository {
    private String names[] = new String[10];
    private int index;

    public void push(String name) {
        names[index] = name;
        index++;
    }

    public String pop() {
        index -= 1;
        var lastName = names[index];
        return lastName;
    }


    public Iterator getIterator() {
        return new ArrayIterator(this);
    }

    private class ArrayIterator implements Iterator {
        public int index;
        public boolean isEndReached = false;

        NameRepository namesRespository;

        private ArrayIterator(NameRepository namesRespository) {
            this.namesRespository = namesRespository;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public boolean hasNext() {
            if (index < namesRespository.index)
                return true;
            isEndReached = true;
            return (index < namesRespository.index);
        }


        @Override
        public void next() {
            index++;
        }


        @Override
        public String current() {
            if (isEndReached)
               return namesRespository.names[index-1];
            return namesRespository.names[index];
        }

        @Override
        public boolean hasPrevious() {
            return (index-1 >= 0);
        }

        @Override
        public void moveFirst() {
           index = 0;
        }

        @Override
        public void moveLast() {
            index = namesRespository.index - 1;
        }

        @Override
        public void previous() {
            index--;
        }

    }
}
