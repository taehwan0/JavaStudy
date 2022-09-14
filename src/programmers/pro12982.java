package programmers;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12982?language=java
 * 예산
 * 부서의 예산 리스트, 총 예산이 주어짐
 * 최대로 해결 할 수 있는 부서의 숫자 도출하기
 */
public class pro12982 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
    }

    public static int solution(int[] d, int budget) {
        int[] sortedArray = Arrays.stream(d).sorted().toArray();
        int cnt = 0;

        for (int i : sortedArray) {
            if(budget < i) return cnt;
            budget -= i;
            cnt++;
        }
        return cnt;
    }
}
