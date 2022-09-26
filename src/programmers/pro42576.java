package programmers;

import java.util.HashMap;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
 * 완주하지 못한 선수
 * 문자열 배열 2개가 주어짐
 * 첫 번째 배열에 속하지만 두 번째 배열에 속하지 못한 이름이 완주하지 못 한 선수
 * 앞의 배열에 이름이 2번 들어간다면, 뒤의 배열에도 2번 들어가야 완주한 것으로 간주
 * solution 해시 값을 이용해서 풀기
 * solution2 해시 맵을 이용해서 풀기
 */
public class pro42576 {

    public static void main(String[] args) {
        String result = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(result);

        String result2 = solution2(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(result2);
    }

    public static String solution(String[] participant, String[] completion) {
        long hashSum = 0;
        for (String s : participant) {
            hashSum += s.hashCode();
        }

        for (String s : completion) {
            hashSum -= s.hashCode();
        }

        for (String s : participant) {
            if (hashSum == s.hashCode()) return s;
        }
        return null;
    }

    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for(String s: map.keySet()) {
            if(map.get(s) != 0) {
                answer = s;
            }
        }
        return answer;
    }
}