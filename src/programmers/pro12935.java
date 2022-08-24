package programmers;

import java.util.Arrays;

/**
 * 코드는 깔끔한데 stream() 사용 시 속도는 낮다고 한다.
 * 프로그래머스의 해당 문제에서는 for() 를 사용하는 방식이 아래의 코드보다 수행 속도가 빠르다고 함..
 */
public class pro12935 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }

    public static int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};

        return Arrays.stream(arr).filter((value) -> value != Arrays.stream(arr).min().getAsInt()).toArray();
    }
}
