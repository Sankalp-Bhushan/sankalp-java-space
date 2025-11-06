package SystemDesign.BehaviouralDesignPattern.IteratorPattern;

// Concrete class that implements Container and provides an inner iterator
public class NameRepository implements Container {
    private String names[] = {"Sankalp", "Aman", "Priya", "Neha"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Inner class implementing Iterator
    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
