package structure;

import java.util.ArrayList;
import java.util.List;

// MaxHeap
public class Heap {

    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
        heap.add(0);
    }

    public void insert(int value) {
        heap.add(value);
        int position = heap.size() - 1;

        while (position > 1 && heap.get(position) > heap.get(position / 2)) {
            swap(position, position / 2);
            position /= 2;
        }
    }

    public int delete() {
        if(this.isEmpty()) throw new RuntimeException("empty heap");
        int lastIndex = heap.size() - 1;
        swap(1, lastIndex);
        Integer removedValue = heap.remove(lastIndex);

        int position = 1;
        while((position * 2) < heap.size()) {
            int max = heap.get(position * 2);
            int maxIndex = position * 2;

            if(maxIndex + 1 < heap.size() && max < heap.get(maxIndex + 1)) {
                max = heap.get(maxIndex + 1);
                maxIndex = maxIndex + 1;
            }

            if(heap.get(position) > max) break;

            swap(position, maxIndex);
            position = maxIndex;
        }
        return removedValue;
    }

    public boolean isEmpty() {
        return this.heap.size() <= 1;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
}
