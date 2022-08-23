package programmers;

public class pro12948 {

    public static void main(String[] args) {
        System.out.println(solution("123456"));
    }

    // 문자열 반복을 String.repeat() 메소드를 통해서 가능하다.
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(Math.max(0, phone_number.length() - 4)));
        sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));
        return sb.toString();
    }
}
