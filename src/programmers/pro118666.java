package programmers;

import java.util.HashMap;

/**
 * 성격 유형 검사하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */
public class pro118666 {

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < choices.length; i++) {
            if(choices[i] < 4) {
                char c = survey[i].charAt(0);
                Integer score = scoreMap.getOrDefault(c, 0);
                score += 4 - choices[i];
                scoreMap.put(c, score);
            } else if(choices[i] > 4) {
                char c = survey[i].charAt(1);
                Integer score = scoreMap.getOrDefault(c, 0);
                score += choices[i] - 4;
                scoreMap.put(c, score);
            }
        }

        StringBuilder sb = new StringBuilder();
        if(scoreMap.getOrDefault('R', 0) >= scoreMap.getOrDefault('T', 0)) sb.append("R");
        else sb.append("T");

        if(scoreMap.getOrDefault('C', 0) >= scoreMap.getOrDefault('F', 0)) sb.append("C");
        else sb.append("F");

        if(scoreMap.getOrDefault('J', 0) >= scoreMap.getOrDefault('M', 0)) sb.append("J");
        else sb.append("M");

        if(scoreMap.getOrDefault('A', 0) >= scoreMap.getOrDefault('N', 0)) sb.append("A");
        else sb.append("N");

        return sb.toString();
    }
}
