package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 문자열 내림차순으로 배치하기
 */
public class pro12917 {

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
        System.out.println(solution2("Zbcdefg"));
    }

    /**
     * String s 를 문자별로 split 하여 List 를 만들고 Collections 의 sort, reverse 를 사용했다.
     * @param s
     * @return
     */
    public static String solution(String s) {
        String[] split = s.split("");
        List<String> sList = new ArrayList<>(Arrays.asList(split));

        Collections.sort(sList);
        Collections.reverse(sList);

        return String.join("", sList);
    }

    /**
     * 라이브러리를 더 적게 사용하는 간단한 방법
     * StringBuilder 에는 reverse 가 존재해서 정렬을 미리 시킨다음 StringBuilder 를 통해 reverse 했다.
     * @param s
     * @return
     */
    public static String solution2(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String str = new String(chars);

        return new StringBuilder(str).reverse().toString();
    }
}
