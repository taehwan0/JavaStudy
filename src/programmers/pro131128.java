package programmers;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128
 * 숫자 짝꿍
 * 숫자로 이루어진 문자열 2개를 입력 받고,
 * 해당 두 문자열에 중복으로 있는 숫자로 가장 큰 값 만들어 리턴하기
 * ex) [111, 111] -> 111, [123, 324] -> 32
 * 중복된 숫자가 없으면 -1
 * 중복된 숫자가 0뿐이면 0
 */

public class pro131128 {

    public static void main(String[] args) {
        System.out.println(solution("123", "123456"));
    }

    public static String solution(String X, String Y) {
        HashMap<String, Integer> mapX = new HashMap<>();
        HashMap<String, Integer> mapY = new HashMap<>();

        for(String x : X.split("")) {
            Integer count = mapX.getOrDefault(x, 0);
            mapX.put(x, count + 1);
        }

        for(String y : Y.split("")) {
            Integer count = mapY.getOrDefault(y, 0);
            mapY.put(y, count + 1);
        }

        StringBuilder sb = new StringBuilder();
        String[] table = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0"};
        for(String t : table) {
            int countX = mapX.getOrDefault(t, 0);
            int countY = mapY.getOrDefault(t, 0);

            int count = Math.min(countX, countY);
            sb.append(t.repeat(Math.max(0, count)));
        }

        if(sb.length() == 0) return "-1";
        else if(sb.toString().startsWith("0")) return "0";
        else return sb.toString();
    }
}
