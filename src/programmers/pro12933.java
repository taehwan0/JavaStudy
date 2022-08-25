package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class pro12933 {

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    /**
     * 문자열로 변환 후 정렬, 뒤집어 반환
     * @param n
     * @return
     */
    public static long solution(long n) {
        String s = Long.toString(n);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chars);
        stringBuilder.reverse();

        return Long.parseLong(stringBuilder.toString());
    }
}
