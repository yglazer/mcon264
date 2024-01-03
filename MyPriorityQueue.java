package yg;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class MyPriorityQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private T[] heap;
    private int size;
    private Comparator<T> comparator;

    public MyPriorityQueue(Comparator<T> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public MyPriorityQueue(int initialCapacity, Comparator<T> comparator) {
        this.heap = (T[]) new Object[initialCapacity];
        this.size = 0;
        this.comparator = comparator;
    }

    public void enqueue(T element) {
        if (size == heap.length - 1) {
            resize();
        }

        heap[++size] = element;
        heapifyUp(size);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        T removedElement = heap[1];
        heap[1] = heap[size--];
        heapifyDown(1);

        return removedElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int newCapacity = heap.length * 2;
        heap = Arrays.copyOf(heap, newCapacity);
    }

    private void heapifyUp(int index) {
        while (index > 1 && compare(heap[index], heap[index / 2]) > 0) {
            swap(index, index / 2);
            index = index / 2;
        }
    }

    private void heapifyDown(int index) {
        int left = 2 * index;
        int right = 2 * index + 1;
        int largest = index;

        if (left <= size && compare(heap[left], heap[largest]) > 0) {
            largest = left;
        }

        if (right <= size && compare(heap[right], heap[largest]) > 0) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private int compare(T a, T b) {
        if (comparator != null) {
            return comparator.compare(a, b);
        }return 0;
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
