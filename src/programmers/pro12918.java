package programmers;

/**
 * 문자열 다루기 기본
 * 문자열의 길이가 4 혹은 6이고, 숫자로만 되어있는지 반환하는 solution 함수 만들기
 */
public class pro12918 {

    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
        System.out.println(solution("abcd"));

        System.out.println(solution2("a234"));
        System.out.println(solution2("1234"));
        System.out.println(solution2("abcd"));
    }

    /**
     * 예외처리 방식으로 풀기.
     * 예외인 부분이 아니기 때문에 용도에는 맞지 않는 방법일듯.
     * @param s
     * @return
     */
    public static boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
            } catch(Exception e) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * 정규식으로 풀기
     * @param s
     * @return
     */
    public static boolean solution2(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("[0-9]*$");
    }
}
