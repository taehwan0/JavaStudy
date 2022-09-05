package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 최소 직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=java
 */
public class pro86491 {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(solution(arr));
    }

    /**
     * 배열을 사용하려면 index 가 필요해서 이런 방식으로 풀었다.
     * List 를 사용하면 방법은 좀 더 편할듯하나 변환이 필요함.
     *
     * 직사각형들을 긴변이 vertical, 짧은변이 horizon 이 되도록 정렬
     * 이후 maxVertical, maxHorizon 을 구해서 곱하고 반환
     * @param sizes
     * @return
     */
    public static int solution(int[][] sizes) {
        int[][] sortedSizes = new int[sizes.length][2];

        int i = 0;
        for (int[] size : sizes) {
            int vertical = Math.max(size[0], size[1]);
            int horizon = Math.min(size[0], size[1]);

            sortedSizes[i][0] = vertical;
            sortedSizes[i][1] = horizon;
            i++;
        }

        int maxVertical = 0;
        int maxHorizon = 0;

        for (int[] sortedSize : sortedSizes) {
            if(maxVertical < sortedSize[0]) maxVertical = sortedSize[0];
            if(maxHorizon < sortedSize[1]) maxHorizon = sortedSize[1];
        }

        return maxVertical * maxHorizon;
    }
}