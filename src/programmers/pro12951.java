package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951?language=java
 * JadenCase 문자열 만들기
 */
public class pro12951 {
    public static void main(String[] args) {
        System.out.println(solution("123  1   asasdasd12e1sad   "));
    }

    public static String solution(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean upper = true;
        for(char c : chars) {
            if(String.valueOf(c).equals(" ")) {
                upper = true;
                sb.append(" ");
            } else {
                if(upper) {
                    upper = false;
                    sb.append(String.valueOf(c).toUpperCase());
                } else {
                    sb.append(String.valueOf(c).toLowerCase());
                }
            }
        }
        return sb.toString();
    }
}
