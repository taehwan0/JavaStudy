package programmers;

import java.util.Arrays;

/**
 * 자릿수의 값들을 모두 합하기
 */
public class pro12931 {

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }

    public static int solution(int n) {
        String[] split = String.valueOf(n).split("");
        return Arrays.stream(split).mapToInt(Integer::parseInt).sum();
    }
}
