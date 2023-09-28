import java.util.Iterator;
import java.lang.Iterable;

class MyList implements Iterable<Integer> {
    private int[] list;

    public MyList(int[] list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

	//nested class 
    private class MyIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return list[index++];
        }
    }

}
