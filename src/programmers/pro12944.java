package programmers;

import java.util.Arrays;

public class pro12944 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 5};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));

        System.out.println(solution2(arr1));
        System.out.println(solution2(arr2));
    }

    /**
     * stream 을 활용해서 값들을 sum 하고 arr.length 와 나누어 평균 값을 구했다.
     * @param arr
     * @return
     */
    public static double solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return (double)sum / (double)arr.length;
    }

    /**
     * 그런데 바로 average 구하는 메소드가 있더라.. 더 간단하게 한 줄로 해결
     * @param arr
     * @return
     */
    public static double solution2(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
