package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class boj25305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int total = Integer.parseInt(input.split(" ")[0]);
		int cut = Integer.parseInt(input.split(" ")[1]);

		input = sc.nextLine();
		int[] scoreArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		Sort sort = new Sort();
		sort.heapSort(scoreArray);
		System.out.println(scoreArray[cut - 1]);
	}
}

class Sort {

	public void heapSort(int[] array) {
		Heap heap = new Heap();

		Arrays.stream(array).forEach(heap::insert);

		for(int i = 0; i < array.length; i++) {
			array[i] = heap.delete();
		}
	}
}

class Heap {

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
