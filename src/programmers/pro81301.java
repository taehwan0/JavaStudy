package programmers;

import java.util.Arrays;

/**
 * 숫자 문자열과 영단어
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
 *
 * 숫자를 의미하느 영단어와 숫자가 섞인 문자열이 들어오고,
 * 해당 단어들을 숫자로 변경한 뒤 리턴하기
 *
 * 1. String.replaceAll(); 몰라서 멍청하게 switch 문으로 풀기..
 * 2. String.replaceAll(); 로 간단하게 풀기
 */
public class pro81301 {

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight56"));
        System.out.println(solution2("one4seveneight56"));
    }

    public static int solution(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        String[] split = s.split("");
        for (String value : split) {
            if (Character.isDigit(value.charAt(0))) {
                result.append(value);
                continue;
            } else {
                sb.append(value);
            }
            switch (sb.toString().toUpperCase()) {
                case "ONE":
                    result.append(1);
                    sb.delete(0, sb.length());
                    break;
                case "TWO":
                    result.append(2);
                    sb.delete(0, sb.length());
                    break;
                case "THREE":
                    result.append(3);
                    sb.delete(0, sb.length());
                    break;
                case "FOUR":
                    result.append(4);
                    sb.delete(0, sb.length());
                    break;
                case "FIVE":
                    result.append(5);
                    sb.delete(0, sb.length());
                    break;
                case "SIX":
                    result.append(6);
                    sb.delete(0, sb.length());
                    break;
                case "SEVEN":
                    result.append(7);
                    sb.delete(0, sb.length());
                    break;
                case "EIGHT":
                    result.append(8);
                    sb.delete(0, sb.length());
                    break;
                case "NINE":
                    result.append(9);
                    sb.delete(0, sb.length());
                    break;
                case "ZERO":
                    result.append(0);
                    sb.delete(0, sb.length());
                    break;
            }
        }
        return Integer.parseInt(result.toString());
    }

    public static int solution2(String s) {
        s = s.toLowerCase();
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < alphabets.length; i++) {
            s = s.replaceAll(alphabets[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
