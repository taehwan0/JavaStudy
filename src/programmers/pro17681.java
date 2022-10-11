package programmers;


import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681?language=java
 * 비밀지도
 */
public class pro17681 {

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[arr1.length];

        int[] map = new int[arr1.length];
        for (int i = 0; i < map.length; i++) {
            map[i] = arr1[i] | arr2[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < map.length; i++) {
            String binary = padding(Integer.toBinaryString(map[i]), n);
            for(String s : binary.split("")) {
                if(s.equals("1")) sb.append("#");
                else sb.append(" ");
            }

            // String.replaceAll() 쓰는 방법
//            binary = binary.replaceAll("1", "#");
//            binary = binary.replaceAll("0", " ");
//            result[i] = binary;
//            result[i] = sb.toString();

            sb.delete(0, sb.length());
        }
        return result;
    }

    private static String padding(String s, int length) {
        if(s.length() < length) {
            int paddingCount = length - s.length();
            return "0".repeat(paddingCount) + s;
        }
        return s;
    }
}
