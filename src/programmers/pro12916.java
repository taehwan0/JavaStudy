package programmers;

/**
 * 문자열 내 p 와 y 의 개수
 * 문자열을 글자별로 쪼개고 반복문으로 카운트 세기
 */
public class pro12916 {

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("pYy"));
        System.out.println(solution(""));

        System.out.println(solution2("pPoooyY"));
        System.out.println(solution2("pYy"));
        System.out.println(solution2(""));
    }

    public static boolean solution(String str) {
        int pCount = 0;
        int yCount = 0;

        str = str.toUpperCase();
        for(String s : str.split("")) {
            if(s.equals("P")) pCount++;
            if(s.equals("Y")) yCount++;
        }

        return pCount == yCount;
    }

    public static boolean solution2(String str) {
        str = str.toUpperCase();
        return str.chars().filter(value -> 'P' == value).count() == str.chars().filter(value -> 'Y' == value).count();
    }
}
