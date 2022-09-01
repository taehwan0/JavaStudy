package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 문자열 내 마음대로 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915?language=java
 *
 * 문자열의 배열을 입력 받아, n 번째 글자를 기준으로 sort 하기
 */
public class pro12915 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(Solution.solution(new String[]{"abce", "abcd", "cdx"}, 2)));
        System.out.println(Arrays.toString(Solution.solution2(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(Solution.solution2(new String[]{"abce", "abcd", "cdx"}, 2)));
    }
}

class Solution {
    /**
     * stream 으로 풀기 sorted 속성으로 n 번째 문자를 통해 비교하도록 함. 대신 뒤의 문자에 대해서는 정렬이 안되어있어 미리 natural sort 를 한번 거치고 나서 했음
     * 수행 속도는 아래보다 2배 이상 빠름
     * @param strings
     * @param n
     * @return
     */
    public static String[] solution(String[] strings, int n) {
        long start = System.currentTimeMillis();

        String[] result = Arrays.stream(strings).sorted().sorted(Comparator.comparing(value -> value.charAt(n))).map(String::valueOf).toArray(String[]::new);

        long end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - start) + " ms");

        return result;
    }

    /**
     * n 번째 문자를 모든 문자열의 앞에 추가해주고 nXXXX 의 형태를 만들어 정렬함
     * 정렬하고 나서 맨 앞의 글자를 제외하고 array 로 반환
     * @param strings
     * @param n
     * @return
     */
    public static String[] solution2(String[] strings, int n) {
        long start = System.currentTimeMillis();

        List<String> tempList = new ArrayList<>();

        for(String string : strings) {
            tempList.add(string.charAt(n) + string);
        }

        tempList.sort(Comparator.naturalOrder());

        String[] result = tempList.stream().map(value -> value.substring(1)).toArray(String[]::new);

        long end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - start) + " ms");

        return result;
    }
}