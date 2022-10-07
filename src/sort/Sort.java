package sort;

public class Sort {

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {

        if(start < end) {
            // 피벗 구하기
            int pivot = partition(array, start, end);
            // 피벗으로 왼쪽 돌리기
            quickSort(array, start, pivot - 1);
            // 피벗으로 오른쪽 돌리기
            quickSort(array, pivot + 1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int key = start;
        int low = start + 1;
        int high = end;
        while(low <= high) {
            if(array[low] <= array[key]) low++;
            else if(array[high] >= array[key]) high--;
            else swap(array, low, high);
        }

        swap(array, high, key);

        return high;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
